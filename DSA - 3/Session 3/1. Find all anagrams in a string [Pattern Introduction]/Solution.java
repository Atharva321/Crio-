// Time  : O(n)
// Space : O(n)

import java.util.*;

// Implement your solution here
class FindAllAnagramsInAString {

    public void count(Map<Character, Integer> countMap, String str) {
        for(int i=0; i<str.length(); i++) { char c= str.charAt(i);
            int initialCount = countMap.getOrDefault(c, 0); 
            countMap.put(c, initialCount+1);
        }
    }

    public boolean ifEqual(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for(Map.Entry<Character, Integer> entry: map1.entrySet()) {
            char c= entry.getKey(); 
            int count = entry.getValue();
            if (count != map2.getOrDefault(c, 0)) {
                return false;
            } 
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>();

        if(s.length() < p.length()) return ans;
        Map<Character, Integer> countP = new HashMap<>(); 
        Map<Character, Integer> countW = new HashMap<>();

        count(countP, p);
        count(countW, s.substring(0, p.length()));

        if(ifEqual(countP, countW)){ 
            ans.add(0);
        }

        for(int i=1; i<s.length()-p.length()+1; i++) { 
            int start = i;
            int end = i+p.length()-1; 
            char cDel = s.charAt(start-1);
            char cIns = s.charAt(end);
            countW.put(cDel, countW.get(cDel)-1);
            int cc = countW.getOrDefault(cIns, 0);
            countW.put(cIns, cc+1);
            if (ifEqual(countP, countW)) { 
                ans.add(start);
            }
        }
        return ans;
    }
