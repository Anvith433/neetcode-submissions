class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int longest=0;
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int val=num;
                int count=1;
                while(set.contains(val+1))
                {
                    val++;
                    count++;
                }
                longest=Math.max(count,longest);
            }
        }
        return longest;
        
    }
}
