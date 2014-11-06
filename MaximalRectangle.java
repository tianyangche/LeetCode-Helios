public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0)
            return 0;
        int m = matrix.length, n = matrix[0].length;
        int max = 0;
        int[] height = new int[n];
        Arrays.fill(height, 0);
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                if(matrix[i][j] == '1')
                    height[j] ++;
                else
                    height[j] = 0;
            }
            max = Math.max(max, largestRectangleArea(height));
        }
        return max;
    }
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