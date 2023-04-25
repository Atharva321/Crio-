// Time Complexity  : O(n)
// Space Complexity : O(1)
 
import java.util.*;

class EqualPartition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        int res = equalPartition(n, arr);

        System.out.println(res);

    }

    static int equalPartition(int n, long arr[]) {
        long totalSum = 0;
        for(int i=0; i < n; i++){
            totalSum += arr[i];
        }

        long prefixSum = 0;
        for(int i=1; i<n-1; i++){
            prefixSum += arr[i-1];
            long suffixSum = totalSum - prefixSum -arr[i];
            if(prefixSum == suffixSum){
                return i;
            }
        }
        return -1;
    }

/*
     Time : O(n)
     Space: O(n)
     static int equalPartition(int n, long arr[]) {
        long suffix [] = new long [n];
        suffix[n-1]  = arr[n-1];
        for(int i=n-2; i >= 0; i--){
            suffix[i] = suffix[i+1] + arr[i];
        }

        long prefixSum = 0;
        for(int i=1; i<n-1; i++){
            prefixSum += arr[i-1];
            if(prefixSum == suffix[i+1]){
                return i;
            }
        }
        return -1;
    }
*/
}
