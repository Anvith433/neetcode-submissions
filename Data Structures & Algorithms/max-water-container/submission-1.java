class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0;
        int j=n-1;
        int max=0;
        while(i<j)
        {
            int width=j-i;
            int height=Math.min(heights[i],heights[j]);
            int area=width*height;
            max=Math.max(max,area);
            if(heights[i]<heights[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return max;
    }
}
