/*

Implement int sqrt(int x).

Compute and return the square root of x.

int sqrt(x)
25 => 5
26 => 5


*/
/*
He Version
*/

public class Solution {
	public int mySqrt(int x) {
    	long l = 0, r = x, mid = 0;
    	while (l <= r) {
        	mid = l + (r - l) / 2;
        	long tmp = mid * mid, tmp1 = (mid + 1) * (mid + 1);
        	if (tmp == x || tmp < x && tmp1 > x) {
            	return (int)mid;
 
        	}
        	if (tmp < x) {
            	l = mid + 1;
        	}
        	else {
            	r = mid - 1;
        	}
    	}
    	return (int)l;
	}
}
