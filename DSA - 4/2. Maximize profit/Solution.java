// Time  :
// Space :

import java.util.*;

class MaxKProfit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        long res = maxKProfit(n, b, a);

        System.out.println(res);
    }

    static long maxKProfit(int N, int B, int[] a) {
        PriorityQueue<Long> pq = new PriorityQueue<>(a.length, Collections.reverseOrder());
        for(int i=0; i<a.length; i++){
            pq.add((long)a[i]);
        }
        long profit = 0;
        while(B!=0 && pq.size() != 0){
            long ticketPrice = pq.poll();
            profit += ticketPrice;
            ticketPrice--;
            if(ticketPrice != 0)
                pq.add(ticketPrice);
            B--;
        }
        return profit;
    }
}
