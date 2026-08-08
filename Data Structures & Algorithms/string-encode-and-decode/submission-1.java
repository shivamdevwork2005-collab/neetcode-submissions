class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int n = str.length(); // 5#hello5#world
        List<String> ans = new ArrayList();
        int i = 0;
        while (i < n) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int len = Integer.parseInt(str.substring(i, j));

            j++; // move 1 ahead to #.

            String s = str.substring(j, j + len);
            ans.add(s);
            i = j + len;
        }
        return ans;
    }
}
