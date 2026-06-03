class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> hash = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[]rawKey = new int[26];
            String x = strs[i];
            for(int j = 0; j < x.length(); j++) {
                int c = x.charAt(j) - 'a';
                rawKey[c]++;
            }
            String key = Arrays.toString(rawKey);

            if (hash.get(key) == null) {
                hash.put(key, new ArrayList<>());
                hash.get(key).add(x);
            }
            else {
                hash.get(key).add(x);
            }
        }  
        return new ArrayList<>(hash.values());
    }
}
