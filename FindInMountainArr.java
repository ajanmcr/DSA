//https://leetcode.com/problems/find-in-mountain-array/description/
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakElementIndex = findPeakElementIndex(mountainArr);
        int minIndex = binarySearch(mountainArr, target, 0, peakElementIndex);
        if(minIndex != -1) {
            return minIndex;
        }
        return binarySearch(mountainArr, target, peakElementIndex+1, mountainArr.length()-1);
    }
    public static int binarySearch(MountainArray mountainArr, int target, int start, int end) {
        int mid;
        boolean asc = mountainArr.get(start) < mountainArr.get(end);
        while(start <= end) {
            mid = start + (end - start) / 2;
            if(mountainArr.get(mid) == target) {
                return mid;
            }

            if(asc) {
                if(mountainArr.get(mid) > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(mountainArr.get(mid) > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static int findPeakElementIndex(MountainArray mountainArr) {
        int start = 0, end = mountainArr.length()-1, mid;
        while(start < end) {
            mid = start + (end - start) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
