class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> solMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int compliment = target - nums[i];

            if(solMap.containsKey(compliment)){

                return new int[]{solMap.get(compliment), i};
            }

            solMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
