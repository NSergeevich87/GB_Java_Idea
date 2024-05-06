package SimpleClass;

import java.util.List;

public class evenNums {
    public static Integer returnEvenNums(List<Integer> nums) {
        int result = 0;
        for (Integer num : nums) {
            if (num % 2 == 0){
                result++;
            }
        }
        return result;
    }

    public static Integer divisFromMaxMinElem(List<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    public static boolean checkNullNeighbor(List<Integer> nums) {
        int neighbor = 0;

        for (int num : nums) {
            if (num == 0) neighbor++;
            if (num != 0) neighbor = 0;
            if (neighbor == 2) return  true;
        }

        return false;
    }
 }
