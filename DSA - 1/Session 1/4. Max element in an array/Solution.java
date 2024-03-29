// Time  : O(n)
// Space : O(1)

import java.util.*;

class MaxInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int result = maxInArray(n, arr);
        System.out.println(result);
    }

    // TODO: Implement this method
    static int maxInArray(int n, int[] arr) {
        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
