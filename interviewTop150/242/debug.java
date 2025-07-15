import java.util.HashMap;

class Debug {
    public static void main(String[] args) {
        String s = "yqhbicoumu";
        String t = "ouiuycbmqh";
        
        System.out.println("String s: " + s);
        System.out.println("String t: " + t);
        System.out.println();
        
        HashMap<Character, Integer> map = new HashMap<>();
        int different = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            int oldSValue = map.getOrDefault(sChar, 0);
            int newSValue = oldSValue + 1;
            int sDiff = newSValue == 0 ? -1 : 1;
            
            int oldTValue = map.getOrDefault(tChar, 0);
            int newTValue = oldTValue - 1;
            int tDiff = newTValue == 0 ? -1 : 1;
            
            map.put(sChar, newSValue);
            map.put(tChar, newTValue);
            
            different += sDiff + tDiff;
            
            System.out.println("Step " + (i+1) + ":");
            System.out.println("  s[" + i + "] = '" + sChar + "' -> count: " + oldSValue + " -> " + newSValue + " (diff: " + sDiff + ")");
            System.out.println("  t[" + i + "] = '" + tChar + "' -> count: " + oldTValue + " -> " + newTValue + " (diff: " + tDiff + ")");
            System.out.println("  different: " + different);
            System.out.println("  map: " + map);
            System.out.println();
        }
        
        System.out.println("Final result: " + (different == 0));
    }
} 