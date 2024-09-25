package warmup2;

public class NoTriples {
    public boolean noTriples(int[] nums) {
        if (nums.length < 3)
            return true;

        for (int i = 1; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1] && nums[i] == nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
