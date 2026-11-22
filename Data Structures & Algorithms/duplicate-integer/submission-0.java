class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int val : nums){
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }

        for(int key : freq.keySet()){
            if(freq.get(key) > 1){
                return true;
            }
        }
        return false;
    }
}