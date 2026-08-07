class Solution {
    String sortStr(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String res = new String(arr);
        return res;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList();
        String[] copy = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            String res = sortStr(strs[i]);
            copy[i] = res;
        }

        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if(visited[i]) continue;

            List<String> temp = new ArrayList();
            temp.add(strs[i]);
            visited[i]=true;
            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && copy[i].equals(copy[j])) {
                    temp.add(strs[j]);
                    visited[j]=true;
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
