class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        HashSet<Integer> st = new HashSet();
        for (int ele : nums) st.add(ele);

        int len = 1;
        for (int ele : st) {
            if (!st.contains(ele - 1)) {
                int count = 1;
                int x = ele; // first ele;
                while (st.contains(x + 1)) {
                    count++;
                    x++;
                }
                len = Math.max(len, count);
            }
        }
        return len;
    }
}
