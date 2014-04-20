public class Solution {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        int n = num.length;
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if( n == 0)
            return result;
        ArrayList<Integer> curr;
        do{
            result.add(convert(num));
            nextPermutation(num);
            curr = convert(num);
        }while(!result.get(0).equals(curr));
        return result;
    }
    
    public void nextPermutation(int[] num) {
        int n = num.length;
        if(n < 2)
            return ;
        boolean found = false;
        
        for(int i = n - 2; i >=0 && !found; i --){
            if(num[i] < num[i+1]){
                for(int j = n - 1; j > i && !found; j --){
                    if(num[j] > num[i]){
                        swap(num, i, j);
                        reverse(num, i+1, n-1);
                        found = true;
                    }
                }
            }
        }
        if(!found)
            reverse(num, 0, n-1);
    }
    
    public void swap(int[] num, int a, int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
    
    public void reverse(int[] num, int a, int b){
        if(a >= b)
            return ;
        while( a < b){
            swap(num, a, b);
            a ++;
            b --;
        }
    }
    public ArrayList<Integer> convert(int[] num){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < num.length; i ++){
            result.add(num[i]);
        }
        return result;
    }
}