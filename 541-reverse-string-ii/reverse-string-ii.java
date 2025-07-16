class Solution {
    public String reverseStr(String s, int k) {
// 1. Converting a string to an array of characters (char[])
char[] chars = s.toCharArray();
        int n = chars.length; // String length (number of characters)

        // 2. Loop by row, processing groups
        for (int i = 0; i < n; i += 2 * k) { // i is the beginning of each group
            // 3. Calculating the boundaries for reversal
            int start = i; // The beginning of the reversal is always the current index i
// end is the end of the reversal.  Please note that there may be an incomplete group at the end.
            int end = Math.min(i + k - 1, n - 1);

            // 4. Reversing a part of the array
            reverse(chars, start, end);
        }

        // 5. Converting back to a string
        return new String(chars);
    }

    // 6. Auxiliary function for reversing a part of the array
    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            // Symbol exchange
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            // Moving the pointers
            start++;
            end--;
        }
    }
}