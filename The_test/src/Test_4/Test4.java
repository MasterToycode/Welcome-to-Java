package Test_4;

import java.util.StringJoiner;

public class Test4 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 9};
        int target = 7;
        Print(search(nums, target, true), search(nums, target, false));
    }

    public static int search(int[] nums, int target, boolean isLeft) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (target > nums[middle]) {
                start = middle + 1;
            } else if (target < nums[middle]) {
                end = middle - 1;
            } else {
                result = middle;
                if (isLeft) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return result;
    }

    public static void Print(int left,int right){
        StringJoiner joiner=new StringJoiner(",","[","]");
        joiner.add(Integer.valueOf(left).toString());
        joiner.add(Integer.valueOf(right).toString());
        System.out.println(joiner);
    }




}