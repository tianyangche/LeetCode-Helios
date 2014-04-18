public class Solution {
	public ArrayList<ArrayList<String>> partition(String s) {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        if(s.length() == 0)
            return result;
        ArrayList<String> curr = new ArrayList<String>();
        dfs(s, 0, curr, result);
        return result;
	}

    public void dfs(String s, int start, ArrayList<String> curr, ArrayList<ArrayList<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<String>(curr));
            return;
        }
        for(int i = start; i < s.length(); i++){
            String first = s.substring(start, i +1);
            if(!isPalindrome(first))
                continue;
            curr.add(first);
            dfs(s, i+1, curr, result);
            curr.remove(curr.size()-1);
        }
    }

	public boolean isPalindrome(String s) {
		int n = s.length();
		for (int i = 0; i <= n / 2; i++)
			if (s.charAt(i) != s.charAt(n - 1 - i))
				return false;
		return true;
	}
    
}