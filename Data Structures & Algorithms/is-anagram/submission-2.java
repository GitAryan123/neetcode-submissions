class Solution {
    public boolean isAnagram(String s, String t) {
        //If not of equal length not anagram
        if(s.length() != t.length())
            return false;     

        //use hashmap 
        Map<Character, Integer> freq = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            freq.put(c1, freq.getOrDefault(c1,0)+1);
            char c2 = t.charAt(i);
            freq.put(c2, freq.getOrDefault(c2,0)-1); 
        }

        for(int i : freq.values()){
            if(i != 0)
                return false;
        }
        return true;
    }
}
