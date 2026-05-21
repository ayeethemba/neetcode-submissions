class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<String, Integer> sMap = new HashMap<>();
        Map<String, Integer> tMap = new HashMap<>();


        for(int i = 0; i < s.length(); i++) {
            String x = s.substring(i, i + 1);
            String y = t.substring(i, i + 1);
            
            if (sMap.containsKey(x)) {
                sMap.put(x, sMap.get(x) + 1);
            }
            else {
                sMap.put(x, 1);
            }

            if (tMap.containsKey(y)) {
                tMap.put(y, tMap.get(y) + 1);
            }
            else {
                tMap.put(y, 1);
            }

        }

        return tMap.equals(sMap);

    }
}
