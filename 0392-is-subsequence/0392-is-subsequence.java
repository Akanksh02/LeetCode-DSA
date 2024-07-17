class Solution {
    public boolean isSubsequence(String s, String t) {
       int i = 0,j=0;
        int n = s.length();
        int m = t.length();
        
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        
        if(n<1){
            return true;
        }
        
        while(i<m){
            
            if(ss[j] == tt[i])
            {
                j++;
            }
            i++;
            
             if(n == j)
            return true;
        }
        
       
        
        
        return false;
    }
}