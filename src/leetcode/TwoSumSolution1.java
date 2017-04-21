/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
package leetcode;

import java.util.Arrays;

public class TwoSumSolution1 {
	public static int[] twoSum(int[] nums,int target){
		int[] src = nums.clone();
		Arrays.sort(src);
		int sum=0;//store sum to compare with target
		int[] srcNum = new int[2];
		for(int i=0;i<src.length-1;i++){
			for(int j=1;j<src.length;j++){
				if(i==j){continue;}
				sum=src[i]+src[j];
				if(sum==target){
					srcNum[0]=i;
					srcNum[1]=j;
					break;
				}else if(sum>target){
					break;
				}
			}
			if(sum==target){break;}
		}
		if(srcNum.equals(new int[]{0,0})){System.out.println("no result exists");System.exit(0);}
		int[] result = new int[2];
		for(int i=0;i<src.length;i++){
			if(nums[i]==src[srcNum[0]]){
				result[0]=i;
			}
			if(nums[i]==src[srcNum[1]]){
				result[1]=i;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] nums = {1,3,2,4};
		int target = 6;
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}
}
