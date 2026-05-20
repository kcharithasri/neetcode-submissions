class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer,Integer> countNum = new HashMap<>();
        for(int num:nums){
            countNum.merge(num,1,Integer::sum);
            
        }
        List<Integer> list = new ArrayList<>(countNum.keySet());
        list.sort((a, b) -> countNum.get(b) - countNum.get(a));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
