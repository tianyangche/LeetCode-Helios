public class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() == 0)
            return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int start = -1, max = 0;
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            int length = 0;
            if(c == '('){
                stack.push(i);
            }else{
                if(stack.isEmpty()){
                    start = i ;
                } else{
                    int temp = stack.pop();
                    if(stack.isEmpty())
                        max = Math.max(max, i - start);
                    else
                        max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }
}