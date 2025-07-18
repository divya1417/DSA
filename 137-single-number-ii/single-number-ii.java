class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        // Check every bit (from 0 to 31)
        for (int i = 0; i < 32; i++) {
            int sum = 0;

            for (int num : nums) {
                // Check if ith bit is set in num
                if ((num >> i & 1) == 1) {
                    sum++;
                }
            }

            // If bit count not divisible by 3, it's from the unique number
            if (sum % 3 != 0) {
                result |= (1 << i);  // Set the ith bit in result
            }
        }

        return result;
    }
}