class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n=nums.length;
       Map<Integer,Integer> hmap=new HashMap<>();
       for(int i=0;i<n;i++){
        int num=nums[i];
        int needed=target-num;
        if(hmap.containsKey(needed)){
            return new int[]{hmap.get(needed),i};
        }
        hmap.put(num,i);
       }
       return new int[]{-1,-1};
    }
}