class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> second = new HashMap<>();
        char[] s2 = s.toCharArray(); 
        char[] t2 = t.toCharArray(); 
        for (int i = 0; i < s2.length; i++) {
            if (first.containsKey(s2[i])) {
                first.put(s2[i], first.get(s2[i]) + 1);
            } else {
                first.put(s2[i], 1);
            }
        }
         for (int i = 0; i < t2.length; i++) {
            if (second.containsKey(t2[i])) {
                second.put(t2[i], second.get(t2[i]) + 1);
            } else {
                second.put(t2[i], 1);
            }
        }
        if (first.equals(second)) {
            return true;
        } else {
            return false; 
        }
    }
}
