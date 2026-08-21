class Solution {

    public String encode(List<String> strs) 
    {
      StringBuilder str=new StringBuilder();
      for(String string:strs)
      {
        str.append(string.length()).append("#").append(string);
      }
      return str.toString();
    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            j++;
            String word=str.substring(j,j+length);
            result.add(word);
            i=j+length;
        }
        return result;
    }
}
