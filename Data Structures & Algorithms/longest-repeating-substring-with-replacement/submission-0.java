class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mapp=new HashMap<>();
        int left=0;
        int maxFrequency=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++)
        {
            char currentChar=s.charAt(right);
            mapp.put(currentChar,mapp.getOrDefault(currentChar,0)+1);
            maxFrequency=Math.max(maxFrequency,mapp.get(currentChar));
            int windowLength=right-left+1;
            int replacements=windowLength-maxFrequency;
            while(replacements>k)
            {
                char leftchar=s.charAt(left);
                mapp.put(leftchar,mapp.get(leftchar)-1);
                left++;
                 windowLength=right-left+1;
                 replacements=windowLength-maxFrequency;
            }
            maxLength=Math.max(maxLength,right-left+1);


        }
        return maxLength;
    }
}
