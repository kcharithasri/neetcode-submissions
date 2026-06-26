class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        Set<Integer> numbers = new HashSet<>();
        if(nums.length == 0 )return count;
        for(int num : nums){
            numbers.add(num);
        }
        for (int num : numbers) {
    if (!numbers.contains(num - 1)) {
        int current = num;
        int length = 1;

        while (numbers.contains(current + 1)) {
            current++;
            length++;
        }
        count = Math.max(count, length);
    }
}
        return count;
    }
}
