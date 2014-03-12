public class Solution {
    public int candy(int[] ratings) {
        int candy[] = new int[ratings.length];
        for(int i = 0; i < candy.length; i ++)
            candy[i] = 1;
        int currentMax = 1;
        for(int i = 1; i < ratings.length; i ++){
            if(ratings[i] > ratings[i-1]){
                candy[i] = Math.max(++currentMax, candy[i] );
            }
            else
                currentMax = 1;
        }
        
        currentMax = 1;
        for(int i = ratings.length - 2; i >= 0; i --){
            if(ratings[i] > ratings[i+1])
                candy[i] = Math.max(++currentMax, candy[i]);
            else
                currentMax = 1;
        }
        currentMax = 0;
        for(int i = 0; i < candy.length; i ++){
            currentMax += candy[i];
        }
        return currentMax;
    }
}