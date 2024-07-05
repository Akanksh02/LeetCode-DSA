class Solution {
    public List<String> fizzBuzz(int n) {
       List<String> array = new ArrayList<>(n);
        
        for(int i = 1 , fizz = 0 , buzz = 0; i <= n ; i++){
           fizz++;
            buzz++;
            if(fizz % 3 == 0  && buzz% 5 == 0){
                array.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            }
            else if(fizz == 3){
                array.add("Fizz");
                fizz = 0;
            }
            else if( buzz == 5)
            {
                array.add("Buzz");
                buzz = 0;
            }
            else
                array.add(String.valueOf(i));
        }
        
        return array;
    }
}