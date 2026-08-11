class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int w = hi - lo;
            int ht = Math.min(heights[lo], heights[hi]);
            maxArea = Math.max(maxArea, w * ht);
            if (heights[lo] <= heights[hi])
                lo++;
            else
                hi--;
        }
        return maxArea;
    }
}
