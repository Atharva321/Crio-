// Time  : O(nlogn)
// Space : O(n)

import java.util.*;

class FractionalKnapsack{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,w;
        n=sc.nextInt();
        w=sc.nextInt();

        int wt[]=new int[n];
        int val[]=new int[n];
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        System.out.println(String.format("%.6f",fractionalKnapsack(n,w,wt,val)));
    }

    // static class C implements Comparator<int[]> {
    //     public int compare(int[] a1, int[] a2) {
    //         double cost1 = (double)((double)a1[1]/(double)a1[0]);
    //         double cost2 = (double)((double)a2[1]/(double)a2[0]);
    //         return cost1 > cost2? -1: 1;
    //     }
    // }

    static class Pair {
        
        int weight;
        int value;

        public Pair(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
    
    static double fractionalKnapsack(int n, int capacity, int[] wt, int[] val)
    {
        Pair[] items = new Pair[n];
        for (int i = 0; i < n; i++) {
           items[i] = new Pair(wt[i], val[i]);
       }

       Arrays.sort(items, 
           (obj1, obj2) -> {
               double valPerKgObj1 = (double)obj1.value/obj1.weight;
               double valPerKgObj2 = (double)obj2.value/obj2.weight;
              return Double.compare(valPerKgObj2 , valPerKgObj1);
           });


       double profit = 0;

       for(Pair item: items) {
           
           if (capacity == 0) break;

           if (capacity < item.weight) {
               // profit += (((double)item.value / item.weight)) * capacity;
               profit += (item.value * ((double)capacity / (double)item.weight));
               break;  
               
           }

           profit += item.value;
           capacity -= item.weight;
       }

       return profit;
    }
}
