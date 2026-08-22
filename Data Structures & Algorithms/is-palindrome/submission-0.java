class Solution {
    public boolean isPalindrome(String s) {
        String[] c=s.split("[^a-zA-Z0-9]+");
        StringBuilder updated=new StringBuilder();
        for(int i=0;i<c.length;i++)
        {
            updated.append(c[i]);
        }
        String str = updated.toString();
        str=str.toLowerCase();
        int p=str.length();
        int i=0;
        int j=p-1;
        boolean isPalindrome=true;
        while(i<=j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }
            else 
            {
                isPalindrome=false;
                return isPalindrome;
            }
        }
        return isPalindrome;

    }
}
