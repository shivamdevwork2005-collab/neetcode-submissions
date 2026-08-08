class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prePro = new int[n];
        int[] sufPro = new int[n];

        prePro[0] = 1;
        for (int i = 1; i < n; i++) {
            prePro[i] = prePro[i - 1] * nums[i - 1];
        }

        sufPro[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            sufPro[i] = sufPro[i + 1] * nums[i + 1];
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = prePro[i] * sufPro[i];
        }
        return ans;
    }
}
