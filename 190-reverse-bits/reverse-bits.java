public class Solution {
   
    public int reverseBits(int n) {
        /*
            Approach is
            1.	Pick the last bit of n
	        2.	Shift result left (to make room)
	        3.	Add the bit
	        4.	Repeat for all 32 bits
        */

         int result = 0;

    for (int i = 0; i < 32; i++) {
        int lastBit = n & 1;         // Get last bitAdd commentMore actions
        result = (result << 1) | lastBit; // Shift result left and add bit
        n = n >>> 1;                 // Unsigned right shift n
    }

    return result;
    }
}