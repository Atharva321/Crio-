// Time  : 
// Space : 

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

        // List<Integer> ans = new ArrayList<>();
        
        // int[] a=new int[26];
        
        // for(int i=0;i<p.length();i++)
        //     a[p.charAt(i)-'a']++;
        
        // int end=0,start=0,window=p.length(),count=window;
        
        // for(;end<s.length();end++)
        // {
        //     if(end-start>=window)
        //     {
        //         if(++a[s.charAt(start)-'a']>0)
        //             count++;
        //         start++;
        //     }
            
        //     if(--a[s.charAt(end)-'a']>=0)
        //         count--;
        //     if(count==0)
        //         ans.add(start);
        // }
        // return ans;
        // if(s.length()<p.length()) return ans;
        // int [] pMap = new int [26];
        // Arrays.fill(pMap, 0);
        // for(int i=0; i<p.length();i++){
        //     char ch = p.charAt(i);
        //     pMap[ch - 'a']++;
        // }

        // int [] sMap = new int [26];
        // Arrays.fill(sMap, 0);
        // int pLength = p.length();
        // for(int i=0; i<p.length();i++){
        //     char ch = s.charAt(i);
        //     sMap[ch - 'a']++;
        // }
        // // if(Arrays.equals(pMap, sMap)){
        // //         ans.add(0);
        // // }
        // int i=0;
        // for(i=p.length(); i<s.length();i++){
        //     if(Arrays.equals(pMap, sMap)){
        //         ans.add(i - p.length());
        //     }
        //     sMap[i - p.length()]--;
        //     char ch = s.charAt(i);
        //     sMap[ch - 'a']++;
            
        // }

        // if(Arrays.equals(pMap, sMap)){
        //         ans.add(i - p.length());
        // }

        // return ans;
    }
