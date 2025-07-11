class Solution {
    private boolean compareOpeningAndClosing(char openingBracket, char closingBracket){
        return ((openingBracket == '(' && closingBracket==')') || (openingBracket == '[' && closingBracket ==']') 
        || (openingBracket == '{' && closingBracket =='}'));
    }
    // TC O(N) SC O(N)
    public boolean isValid(String s) {
        // { } [] ()
        Stack<Character> stack = new Stack<>();
        // s contains all the brackets
        // pick the bracket one by one
        for(char singleBracket : s.toCharArray()){
            if(singleBracket =='(' || singleBracket == '{' || singleBracket == '['){
                stack.push(singleBracket); // opening bracket push in a stack
            }
            // if not opening bracketAdd commentMore actions
            else if(!stack.isEmpty() && compareOpeningAndClosing(stack.peek(),singleBracket )){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty(); 
    }
}