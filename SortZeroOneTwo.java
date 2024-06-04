//https://www.naukri.com/code360/problems/sort-0-1-2_631055?topList=love-babbar-dsa-sheet-problems&utm_source=website&utm_medium=affiliate&utm_campaign=450dsatracker&leftPanelTabValue=SUBMISSION
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
      //using three pointer to loop through the array and sort 0, 1, and 2. Low represents 0, mid represents 1 and end represents 2
      //low, and mid point to the start of the array and high at the end of the array
        int low=0, mid=0, high=arr.length-1, temp;
        while(mid <= high) {
            if(arr[mid]==2) {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                //decrement high if the mid is 2
                high--;
            } else if(arr[mid] == 1) {
                //skip if the arr[mid] is 1
                mid++;
            } else {
                //increment low and mid if arr[mid] is 0
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++; mid++;
            }
        }
    }
}
