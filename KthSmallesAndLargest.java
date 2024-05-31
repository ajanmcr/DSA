//https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1; https://www.naukri.com/code360/problems/kth-smallest-and-largest-element-of-array_1115488
import java.util.ArrayList;
import java.util.Comparator;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		arr.sort(Comparator.naturalOrder());
		ArrayList<Integer> pair = new ArrayList<>();
		pair.add(arr.get(k-1));
		pair.add(arr.get(arr.size()-k));
		return pair;
	}
}
