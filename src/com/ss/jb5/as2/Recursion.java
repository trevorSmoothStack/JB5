package com.ss.jb5.as2;

public class Recursion {

	public static void main(String[] args) {
		Recursion rec = new Recursion();
		int nums[] = {1, 2, 2, 2, 5, 2};
		System.out.println(rec.groupSumClump(0, nums, 11));
		System.out.println(rec.groupSumClump(0, nums, 4));
	}

	public boolean groupSumClump(int start, int[] nums, int target) {
	    if(start >= nums.length)
	        return target == 0;
	          
	    int i = start;
	    int sum = 0;
	    
	    while(i < nums.length && nums[start] == nums[i]) {
	        sum += nums[i];
	        i++;
	    }
	                              
	    if(groupSumClump(i, nums, target - sum))
	        return true;
	                                        
	    if(groupSumClump(i, nums, target))
	        return true;
	                                                  
	    return false;
	}
}
