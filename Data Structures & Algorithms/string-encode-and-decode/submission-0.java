class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();

        for (String s : strs) {
            res.append(s.length()).append("#").append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {

        List<String> ans = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find '#'
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // Get length
            int len = Integer.parseInt(str.substring(i, j));

            // Move after '#'
            j++;

            // Extract exactly len characters
            String s = str.substring(j, j + len);

            ans.add(s);

            // Move to next encoded string
            i = j + len;
        }

        return ans;
    }
}