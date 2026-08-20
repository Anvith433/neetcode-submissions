class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
       for(String s: strs)
       {
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String neww=new String(ch);
        if(!map.containsKey(neww))
        {
            map.put(neww,new ArrayList<>());
        }
        map.get(neww).add(s);
       }
       return new ArrayList<>(map.values());
    }
}
