package ru.gb.Unit_tests_seminar_5.number;

import java.util.List;

public class MaxNumberModule {
    public Integer findMax (List<Integer> nums) {
        Integer max = nums.get(0);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }

        return max;
    }

    public int findMaximum (int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }
}
