class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        HashSet<Integer> st = new HashSet();
        for (int ele : nums) st.add(ele);

        int len = Integer.MIN_VALUE;
        for (int ele : st) {
            if (!st.contains(ele - 1)) {
                int count = 1;
                int x = ele;

                while (st.contains(x + 1)) {
                    count++;
                    x++;
                }
                len = Math.max(len, count);
            }
        }
        return len == Integer.MIN_VALUE ? 0 : len;
    }
}
