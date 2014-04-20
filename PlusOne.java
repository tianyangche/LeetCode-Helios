public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int temp;
        
        
        
        temp = digits[digits.length -1 ];
        digits[digits.length - 1] = (digits[digits.length - 1] + 1 + carry) % 10;
        carry = (temp + 1 + carry)/10;
        
        
        
        for(int digit = digits.length - 2; digit >= 0; digit --) {
            temp = digits[digit];
            digits[digit] = (digits[digit] + carry) % 10;
            carry = (temp + carry) / 10;
        }
        if(carry == 1){
            int newDigits[] = new int[digits.length + 1];
            for(int i = 1; i < newDigits.length; i++){
                newDigits[i] = digits[i-1];
            }
            newDigits[0] = 1;
            return newDigits;
        }
        
        return digits;
    }
}