class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int mLen = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Character> st = new HashSet();
            int len = 0;
            for (int j = i; j < n; j++) {
                if (st.contains(s.charAt(j)))
                    break;
                st.add(s.charAt(j));
                len = j - i + 1;
                mLen = Math.max(mLen, len);
            }
        }
        return mLen;
    }
}
