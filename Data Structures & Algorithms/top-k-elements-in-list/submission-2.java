class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
    HashMap<Integer,Integer> mapp=new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
    }


    PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->mapp.get(a)-mapp.get(b));
    int[] result=new int[k];
    for(int key:mapp.keySet())
    {
       q.offer(key);
        if(q.size()>k)
        {
          q.poll();
        }
        
    }
  for(int i=0;i<k;i++)
  {
    result[i]=q.poll();
  }
    return result;
    }
}
