class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> st = new HashSet();
        for (int ele : nums) st.add(ele);
        return st.size() == n ? false : true;
    }
}