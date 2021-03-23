def group_summation(nums,target):
    nums.sort()
    if len(nums)==1:
        if nums[0]!=target:
            return False
        return True
    else:
        if sum(nums) == target:
            return True
        if sum(nums) < target:
            return False
        if nums[-1] > target:
            return group_summation(nums[:-1], target)
        if nums[-1] < target:
            diff = target - nums[-1]

            if group_summation(nums[:-1], diff) == False:
                return group_summation(nums[:-1], target)
            else:
                return group_summation(nums[:-1], diff)
        if nums[-1] == target:
            return True
