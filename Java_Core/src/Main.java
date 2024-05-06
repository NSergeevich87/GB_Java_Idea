import SimpleClass.evenNums;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // prepare array
        List<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(2);
        nums.add(0);
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // prepare functions
        evenNums hw = new evenNums();

        // 1
        int result1 = hw.returnEvenNums(nums);
        System.out.println(result1);

        // 2
        int result2 = hw.divisFromMaxMinElem(nums);
        System.out.println(result2);

        // 3
        boolean result3 = hw.checkNullNeighbor(nums);
        System.out.println(result3);
    }
}
