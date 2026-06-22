class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(String s : strs){
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String sortedS = new String(str);
            result.putIfAbsent(sortedS, new ArrayList<>());
            result.get(sortedS).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
