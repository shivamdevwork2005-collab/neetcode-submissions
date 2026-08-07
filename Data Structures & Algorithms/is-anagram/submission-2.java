
class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = t.length();
        int n2 = s.length();
        if (n1 != n2)
            return false;

        HashMap<Character, Integer> mp = new HashMap();
        for (int i = 0; i < n1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (!mp.containsKey(ch1)) {
                mp.put(ch1, 1);
            } else {
                mp.put(ch1, mp.get(ch1) + 1);
            }

            if (!mp.containsKey(ch2)) {
                mp.put(ch2, -1);
            } else {
                mp.put(ch2, mp.get(ch2) - 1);
            }
        }

        for (char ch : mp.keySet()) {
            if (mp.get(ch) != 0)
                return false;
        }
        return true;
    }
}
