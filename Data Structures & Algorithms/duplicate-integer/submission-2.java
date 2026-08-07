class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> st = new HashSet();
        for(int ele: nums){
            if(!st.contains(ele)) st.add(ele);
            else return true;
        }
        return false;
    }
}