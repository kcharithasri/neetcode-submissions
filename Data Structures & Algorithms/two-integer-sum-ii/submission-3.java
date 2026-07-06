class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] r = new int[2];

        for(int i=0;i<numbers.length-1 ;i++){
            for(int j=i+1;j<numbers.length;j++){
                if((numbers[i] + numbers[j]) == target){
                    r[0] = i+1;
                    r[1] = j+1;
                }
            }
        }
        return r;
    }
}
