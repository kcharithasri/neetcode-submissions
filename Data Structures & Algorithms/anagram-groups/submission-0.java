class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // if (strs.length==0 || strs.length==1) return strs;
        Map<String, List<String>> res = new HashMap<>();
        
        for (String str : strs) {
            
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            
            String key = new String(chars);
            
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        
        return new ArrayList<>(res.values());
    }
}
