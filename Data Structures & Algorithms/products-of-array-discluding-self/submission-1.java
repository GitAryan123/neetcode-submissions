class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        //init output array with 1
        for(int i = 0;i<output.length;i++){
            output[i] = 1;
        }

        //prefix (left to right expect self)
        int prefix = 1;
        for(int i = 0;i<output.length;i++){
            output[i] = prefix;
            prefix *= nums[i]; 
        }

        //suffix (right to left expect self)
        int suffix = 1;
        for(int i = output.length -1;i >= 0 ;i--){
            output[i] *= suffix;
            suffix *= nums[i]; 
        }

        return output;
    }
}  
