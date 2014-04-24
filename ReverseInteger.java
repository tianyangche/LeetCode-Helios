public class Solution {
    public int reverse(int x) {
        int result = 0;
        for(; x != 0; x /= 10)
            result = result*10 + x%10;
        return result;
    }
}