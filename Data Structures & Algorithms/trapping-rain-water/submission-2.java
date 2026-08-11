class Solution {
    public int trap(int[] height) {
        // using two pointers
        int n = height.length;
        int i = 0, j = n - 1;
        int ans = 0 , leftM = 0 , rightM = 0;
        while (i < j) {
            leftM = Math.max(leftM , height[i]);
            rightM = Math.max(rightM , height[j]);

            if(leftM < rightM){
                ans += Math.min(leftM , rightM) - height[i];
                i++;
            }else{
                ans += Math.min(leftM , rightM) - height[j];
                j--;
            }
        }
        return ans;
    }
}
