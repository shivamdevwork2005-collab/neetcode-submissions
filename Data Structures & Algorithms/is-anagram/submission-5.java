public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
           mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            else{
                mp.put(ch,mp.getOrDefault(ch,0)-1);
                if(mp.get(ch)==0) mp.remove(ch);
            }
        }

        return mp.size()==0;
    }
}