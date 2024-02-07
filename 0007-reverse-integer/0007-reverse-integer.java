class Solution {
    public int reverse(int x) {
      int a = Math.abs(x);
        
        int rev = 0;
        while(a != 0){
           int lastdigit = a % 10 ;
            
            if(rev > (Integer.MAX_VALUE - lastdigit ) / 10)
                return 0;
            
            rev = rev*10 + lastdigit;
            a = a/10;
            
        }
        if(x < 0)
            return (-rev);
        else
            return rev;
    }
}