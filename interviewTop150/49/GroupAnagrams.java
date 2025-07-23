import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();
        for (String word : strs) {
            HashMap<Character, Integer> letterMap = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                letterMap.put(letter, letterMap.getOrDefault(letter, 0) + 1);
            }
            map.computeIfAbsent(letterMap, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}