import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

// class Pair implements Comparable<Pair>{
//     int num;
//     int freq;

//     public Pair(int num, int freq){
//         int num = this.num;
//         int freq = this.freq;
//     }

//     @Override
//     public int compareTo(Pair o){
//         return freq > o.freq;
//     }
// }

class TopKFrequent {
    
    // Implement your solution by completing the below function
    static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        int arr[] = new int[100006];
        Arrays.fill(arr, 0);
        for(int num: nums){
            hmap.put(num, hmap.getOrDefault(num, 0)+1);
        }
        List<Integer> collect = hmap.entrySet().stream().sorted((t2, t1) -> {
            if (t2.getValue() > t1.getValue()) {
                return -1;

            } else if (t2.getValue() < t1.getValue()) {
                return +1;

            } else {
                return t2.getKey().compareTo(t1.getKey());
            }
        }).map(entry -> entry.getKey()).collect(Collectors.toList());
        
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<k; i++){
            ans.add(collect.get(i));
        }
        // List<Integer> ans = new ArrayList<>();
        // while(pq.size() > 0){
        //     ans.add(pq.poll());
        // }
        // Collections.sort(ans);
        return ans;
    //     TreeMap<String, Integer> initTree = new TreeMap();
    //     Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
    //     @Override
    //     public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
    //         return e1.getValue().compareTo(e2.getValue());
    //     }
    // });
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; ++i)
            nums[i] = scanner.nextInt();

        int k = scanner.nextInt();
        scanner.close();

        List<Integer> result = topKFrequent(nums, k);
        for (Integer x: result) {
            System.out.print(x + " ");
        }
    }
}
