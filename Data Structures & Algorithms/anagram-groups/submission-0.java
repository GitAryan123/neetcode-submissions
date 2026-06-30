class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap: key = sorted string, value = list of anagrams
        Map<String, List<String>> stringMap = new HashMap<>();

        for(String s : strs){
            
            int[] freqArray = new int[26];

            for(char c: s.toCharArray()){
                freqArray[c-'a']++;
            }

            String key = Arrays.toString(freqArray);

            //If no record for this key create 
            if(!stringMap.containsKey(key)){
                stringMap.put(key,new ArrayList<>());
            }
            
            //Add string to anagram list
            stringMap.get(key).add(s);
        }

        return new ArrayList<>(stringMap.values());
    }
}
