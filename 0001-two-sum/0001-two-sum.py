class Solution(object):
    def twoSum(self, nums, target):
        seen = {}
        for  i in range(len(nums)):
            current = nums[i]
            needed = target - nums[i]
            if needed in seen:
                return [seen[needed],i]
            else:
                seen[current]= i
        return []
        
