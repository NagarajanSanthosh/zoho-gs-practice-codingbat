package leetcodehw;

public class JumpGame2 {
    public static int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        // Iterate up to the second-to-last index because the last index doesn't need a jump.
        for (int i = 0; i < nums.length - 1; i++) {
            // Find the farthest index we can reach from the current position.
            farthest = Math.max(farthest, i + nums[i]);

            // If we have reached the end of the current jump, make a new jump.
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
    public static void main(String[] args) {
        System.out.println(jump(new int[] {2, 3, 1, 1, 4}));
    }
}
