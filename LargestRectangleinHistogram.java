public class Solution {
    public int largestRectangleArea(int[] height) {
        Stack<Node> stack = new Stack<Node>();
        if(height.length == 0)
            return 0;
        int max = 0, index = 0;
        Node temp = new Node();
        while(index < height.length){
            if(stack.isEmpty() || stack.peek().height < height[index]){
                stack.push(new Node(height[index], index));
            } else{
                while(!stack.isEmpty() && stack.peek().height >= height[index]){
                    temp = stack.pop();
                    max = Math.max(max, (index - temp.start) * temp.height);
                }
                stack.push(new Node(height[index], temp.start));
            }
            index ++;
        }
        while(!stack.isEmpty()){
            temp = stack.pop();
            max = Math.max(max, (height.length - temp.start) * temp.height);
        }
        return max;
    }
    
    
    class Node{
        public int height;
        public int start;
        public Node(){}
        public Node(int h, int s){
            height = h;
            start = s;
        }
    }
}