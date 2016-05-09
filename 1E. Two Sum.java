/*
1. Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
UPDATE (2016/2/13):
The return format had been changed to zero-based indices. Please read the above updated description carefully.


*/


public class Solution {  
    public int[] twoSum(int[] numbers, int target) {  
      int[] num = numbers.clone();  
      Arrays.sort(num);//unstability sort  
        
      int length = numbers.length;  
      int left = 0;  
      int right = length -1;  
      int sum = 0;  
      int[] index = new int[2];  
      ArrayList<Integer> list = new ArrayList<Integer>();// not int  
        
      while(left<right){  
          sum= num[left] + num[right];  
        
          if(sum<target)  
            ++left;  
          else if(sum > target)  
            --right;  
          else{  
              list.clear();  
              for(int i = 0; i < length; i++){  
                  if(list.size()==2)  
                    break;  
                  if(numbers[i]==num[left]){  
                    list.add(i+1);  
                  }  
                  else if(numbers[i]==num[right]){    
                     list.add(i+1);  
                  }  
                    
                    
              }  
              break;  
          }  
      }  
        
      int i = 0;  
      for(Iterator it = list.iterator();it.hasNext();++i){  
        index[i]=(int)it.next()-1;  
      }  
      return index;  
    }  
}  
