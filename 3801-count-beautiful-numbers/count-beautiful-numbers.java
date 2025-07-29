class Solution {
    public int beautifulNumbers(int l, int r) {
        // System.out.println(calc(r) +" "+calc(l-1));
        return calc(r) - calc(l-1);
    }

    public int calc(int l){
        String s = String.valueOf(l);
        // System.out.println(s);
        HashMap<String, Integer> dp = new HashMap<>();
        return helper(s, 0, 1, 0, 1, dp);
        // return 0;
    }

    public int helper(String num, int i, int tight, int sum, int prod, HashMap<String, Integer> dp){
        if(i==num.length()) return (sum>0 && prod%sum==0)?1:0;
        String key = i + "." + tight +"."+sum+"."+prod;
        if(dp.containsKey(key)) return dp.get(key);

        int ans=0;
        for(int digi = 0; digi<=(tight==1 ? num.charAt(i)-'0' : 9);digi++){
            int newSum = sum+digi;
            int newProd = newSum>0 ? prod*digi : prod;
            int temp = (digi==num.charAt(i)-'0' ? 1 :0);
            int newTight=tight;
            if(temp==0) newTight = 0;
            ans += helper(num, i+1, newTight, newSum, newProd, dp);
        }

        dp.put(key, ans);
        return ans;


    }
}