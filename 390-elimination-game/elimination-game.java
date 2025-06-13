class Solution {

    public int lastRemaining(int n) {
        int passes = 0; // the number of passes begun/completed
        int count = n;  // the count of retained values
        int gap = 1;    // the difference between successive retained values
        int first = 1;  // the first retained value
        while (count > 1) {
            passes++; // increment -> the pass we are beginning
            // If we are beginning an odd pass, or an even pass with an odd count,
            // then the current first element will be eliminated leaving first + gap
            // as the first element.  Otherwise the first element will remain the same.
            if ((passes & 1) == 1 || (count & 1) == 1) {
                first += gap;
            }
            count >>= 1; // divides by 2, rounding down
            gap <<= 1;   // multiplies by 2
        }
        return first;
    }

}