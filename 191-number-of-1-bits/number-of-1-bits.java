class Solution {
    //Solution 1 
    // public int hammingWeight(int n) {
    //     return Integer.bitCount(n);
    // }

    // Solution 2
     public int hammingWeight(int n) {
       int count = 0;
        while (n>0) {
            n = n & (n - 1); // removes lowest set bit
            count++;
        }
    return count;
    }
}