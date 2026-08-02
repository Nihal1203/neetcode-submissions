func hasDuplicate(nums []int) bool {
    m:= make(map[int]bool,len(nums))

    for i:=0;i<len(nums);i++{
        _,contains:= m[nums[i]]
        if contains{
            return true;
        } else {
            m[nums[i]]=true;
        }
    }
    return false;
}
