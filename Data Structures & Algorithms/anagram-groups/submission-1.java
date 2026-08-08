class Solution {
    public String genrate(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }

        String res = "";
        for (int i = 0; i < 26; i++) {
            int count = freq[i];

            while(count > 0){
                res+=(char) (i+'a');
                count--;
            }
        }
        return res;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String, List<String>> mp = new HashMap();

        for (int i = 0; i < n; i++) {
            String word = strs[i];
            String newWord = genrate(word);
            if (!mp.containsKey(newWord)) {
                mp.put(newWord, new ArrayList<>());
            }
            mp.get(newWord).add(word);
        }

        List<List<String>> ans = new ArrayList();
        for (String s : mp.keySet()) {
            ans.add(mp.get(s));
        }
        return ans;
    }
}
