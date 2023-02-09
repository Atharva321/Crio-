// Time  : O(n)
// Space : O(n)

import java.io.*;
import java.util.*;

class KthLargestElementInAnArray {
    
    // Implement your solution by completing the below function
    public int findKthLargest(int[] nums, int k) {
        int result;
        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length, Collections.reverseOrder());
        for(int i=0; i<nums.length; i++) pq.add(nums[i]);
        for(int i=0; i<k-1; i++) pq.poll();   
        return pq.poll();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; ++i)
            nums[i] = scanner.nextInt();

        int k = scanner.nextInt();
        scanner.close();

        int result = new KthLargestElementInAnArray().findKthLargest(nums, k);
        System.out.println(result);
    }
}
