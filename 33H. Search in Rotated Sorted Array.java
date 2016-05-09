/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.


EX: Array: 4 5 6 7 0 1 2   look for 0
*/
/*
He Version
*/

public class Solution {
	public int search(int[] nums, int target) {
    	int l = 0, r = nums.length-1;
    	while (l <= r) {
        	int mid = l + (r - l)/2;
        	if (nums[mid] == target) {
            	return mid;
        	}
        	if (nums[mid] >= nums[l]) {
            	if (target >= nums[l] && target < nums[mid]) {
               	 r = mid-1;
            	}
            	else {
                	l = mid+1;
            	}
        	}
        	else {
            	if (target <= nums[r] && target > nums[mid]) {
                	l = mid+1;
            	}
     	       else {
                	r = mid-1;
            	}
        	}
    	}
    	return -1;
	}
}
 
