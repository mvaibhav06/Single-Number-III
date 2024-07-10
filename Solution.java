class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> temp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            temp.put(nums[i], temp.getOrDefault(nums[i],0)+1);
        }
        int[] out = new int[2];
        int k = 0;
        for(int key : temp.keySet()){
            if(temp.get(key)==1){
                out[k++] = key;
            }
        }
        return out;
    }
}
