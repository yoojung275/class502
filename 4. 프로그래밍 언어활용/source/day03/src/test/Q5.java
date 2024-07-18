package test;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] nums = {21, 22, 30, 11, 99, 31};
        for (int i=0; i<(nums.length)/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;

        }
        System.out.println(Arrays.toString(nums));
    }
}
