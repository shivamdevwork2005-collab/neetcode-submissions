class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> mp = new HashMap();
        for(String word:strs){
            String word1 = word;
            char[] arr = word1.toCharArray();
            Arrays.sort(arr);
            String nWord = new String(arr); // sorted hai

            // make this as key
            if(!mp.containsKey(nWord)){
                mp.put(nWord,new ArrayList());
            }
            mp.get(nWord).add(word1);
        }

        List<List<String>> res = new ArrayList();
        for(String s:mp.keySet()){
            res.add(mp.get(s));
        }
        return res;
    }
}
