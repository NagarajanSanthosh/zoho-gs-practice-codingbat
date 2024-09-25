package warmup2;

public class Array667 {
    public static int array667(int[] nums) {
        if (nums.length < 2)
            return 0;

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

}
