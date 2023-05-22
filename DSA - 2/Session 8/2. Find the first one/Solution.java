// Time  : O(nlogn)
// Space : O(1)

import java.util.*;

class ZeroOnes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int res = zeroOnes(n, a);
        System.out.println(res);

    }

    public static int zeroOnes(int n, int a[]) {
        if(a[n-1]==0) return -1;
        if(a[0] == 1) return 0;
        if(a[0] == 0 && a[1] == 1) return 1;
        return binarySearch(0, n-1, 1, a);
    }

    public static int binarySearch(int low, int high, int target, int [] arr){
        while(low <= high){
            int mid = low +(high - low)/2;
            if(arr[mid] == target && arr[mid-1] == 0){
                return mid;
            }
            else if(arr[mid-1] == target){
                high = mid-1;
            }
            else if(arr[mid] == 0){
                low = mid+1;
            }
        }
        return -1;
    }
}
