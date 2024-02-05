class Solution {
    public boolean wordPattern(String pattern, String s) {
       String word[] = s.split(" ");

        if(word.length != pattern.length())
        return false;

        else{

        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Boolean> used = new HashMap<>();

        for(int i=0 ; i< pattern.length(); i++)
        {
            char c = pattern.charAt(i);
            if(map.containsKey(c) == false)
            {
                if(used.containsKey(word[i]) == true)
                 return false;
                 else
                 used.put(word[i],true);
                 map.put(c,word[i]);
            }
            else
            {
                String mapWith = map.get(c);
                if(mapWith.equals(word[i]) == false)
                return false;
            }
        }
        }
        return true; 
    }
}