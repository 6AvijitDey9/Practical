package Array_assignment;

import java.util.Arrays;

public class Array_MinMax {

	public static void main(String[] args) {
		int[] nums = { 12, 89, 56, 78, 90, 10 };
		int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] > max) {
                max = nums[i];
            }
            else if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);
        Arrays.sort(nums);
        System.out.println("Min is " + nums[0]);
        System.out.println("Max is " + nums[nums.length - 1]);
    }}

