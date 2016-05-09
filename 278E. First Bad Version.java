/*
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

version: 1 2 3 4 5 6 7 8 
判断条件：if (isBadVersion(mid) && (mid == 1 || !isBadVersion(mid-1)))

left   right  mid   isFirstBadVersion
1      8	     4      No, left = 5
5      8       6      yes, return mid


*/
/*
He Version
*/

public class Solution extends VersionControl {
	public int firstBadVersion(int n) {
    	int l = 1, r = n, mid = 0;
    	while (l <= r) {
        	mid = l + (r - l) / 2;
        	if (isBadVersion(mid)) {
            	if (mid == 1 || !isBadVersion(mid-1)) {
                	return mid;
            	}
            	r = mid - 1;
        	}
        	else {
            	l = mid + 1;
        	}
    	}
    	return l;
	}
}

