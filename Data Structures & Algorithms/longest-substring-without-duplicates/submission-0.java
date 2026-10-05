class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character> sett=new HashSet<>();
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++)
        {
          while(sett.contains(s.charAt(right)))
          {
            sett.remove(s.charAt(left));
            left++;
          }
          sett.add(s.charAt(right));
          maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
