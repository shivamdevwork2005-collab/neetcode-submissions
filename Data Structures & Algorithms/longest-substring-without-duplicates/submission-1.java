class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> st = new HashSet();
        int max = 0;
        int i = 0, j = 0;
        while (j < n) {
            char ch = s.charAt(j);
            while (st.contains(ch)) {
                st.remove(s.charAt(i));
                i++;
            }

            st.add(ch);
            int len = j - i + 1;
            max = Math.max(max, len);
            j++;
        }
        return max;
    }
}
