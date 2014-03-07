public class Solution {
    public int largestRectangleArea(int[] height) {
        int maxArea = 0;
        Stack<Ele> stack = new Stack<Ele>();
        int index = 0;
        if(height.length == 0)
            return maxArea;
        
        while(index != height.length){
            if(stack.isEmpty() || stack.peek().height < height[index] ){
                stack.push(new Ele(index, height[index]) );
            } else{
                Ele temp = new Ele();
                while(!stack.isEmpty() &&stack.peek().height>=height[index] ){
                    temp = stack.pop();
                    maxArea = Math.max(maxArea, temp.height*(index-temp.index) );
                }
                stack.push(new Ele(temp.index, height[index]) );
            }
            index++;
        }
        
        while(!stack.isEmpty() ){
            Ele temp = stack.pop();
            maxArea = Math.max(maxArea, temp.height*(index-temp.index) );
        }
        
        return maxArea;
        
    }
    
    class Ele{
        int height;
        int index;
        public Ele(){
            
        }
        public Ele(int i, int h){
            height = h;
            index = i;
        }
    }

    
}
