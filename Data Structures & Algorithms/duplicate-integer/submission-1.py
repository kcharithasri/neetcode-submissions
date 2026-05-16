class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        i=0
        flag=False;
        while(i<len(nums)-1):
            if(nums[i]==nums[i+1]):
                flag=True
                break
            i+=1
        return flag;
        