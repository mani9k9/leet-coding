class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
          Map<Character, Integer> freq = new HashMap<>();
        for(char c: magazine.toCharArray()) {
            if(freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }
        for(char c: ransomNote.toCharArray()) {
            if (freq.containsKey(c)) {
                if(freq.get(c) > 1) {
                    freq.put(c, freq.get(c) - 1);
                } else {
                    freq.remove(c);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}