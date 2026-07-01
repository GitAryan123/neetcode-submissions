class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        //store freq of each num
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        
        //create buckets for each freq to hold nums with that freq
        List<Integer>[] buckets = new ArrayList[nums.length+1];

        for(int i=0; i< buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }

        int[] result = new int[k];
        int index = 0;
        
        //choose top k elements
        for(int i = buckets.length-1; i > 0 && index < k ; i--){
           if(!buckets[i].isEmpty()){
             for(int num : buckets[i]){
                 result[index++] = num;
                 if (index == k) break;
             }
           }
        }
        return result;
    }
}
