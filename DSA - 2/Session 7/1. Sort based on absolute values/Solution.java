// Time  : O(nlogn)
// Space : O(1)

import java.util.*;

class SortArrayAbsolute {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        //SortArrayAbsolute srt = new SortArrayAbsolute();
        int res[] = sortArrayAbsolute(n, arr);

        for (int j : res)
            System.out.print(j + " ");
    }
    // class CustomComp extends Comparator<Integer> {
    //     @Override
    //     public int compare(Integer i1, Integer i2) {
    //         if (Math.abs(i1) < Math.abs(i2)){
    //             return -1;
    //         }
    //         else if (Math.abs(i1) > Math.abs(i2)){
    //             return 1;
    //         }
    //         else if (i1 > i2){
    //             return 1;
    //         }
    //         else if (i1 > i2){
    //             return 1;
    //         }
    //         else{
    //             return 0;
    //         }
    //     }
    // }
    
    static int[] sortArrayAbsolute(int n, int arr[]) {
         
        Integer ar [] =  new Integer [n];
        for(int i=0; i<n; i++){
            ar[i] = new Integer(arr[i]);
        }
        // Arrays.sort(ar, (a, b) -> Math.abs(a) - Math.abs(b));
        
        Arrays.sort(ar, new Sortbyroll());
        
        for(int i=0; i<n; i++){
            arr[i] =ar[i];
        }
        return arr;
    }
}
class Sortbyroll implements Comparator<Integer> {
    // Method
    // Sorting in ascending order of roll number
        public int compare(Integer a, Integer b){
            return Math.abs(a) - Math.abs(b);
        }
}
