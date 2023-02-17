// Time  : O(n)
// Space : O(1)

import java.util.*;


class AverageHeight{
    // NOTE: Please do not modify this function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a[] = new float[n];
        float sum =0;

        for(int i = 0; i < n; i++)
        {
            a[i] = Float.parseFloat(sc.next());
        }

        float avgHeight = averageHeight(n, a, sum);
        System.out.println(avgHeight);
    }

    // TODO: Implement this method
    static float averageHeight(int n, float[] a, float sum){
        if(n-1==0){
            return sum + a[n-1]/a.length;
        }
        sum += a[n-1]/a.length;
        return averageHeight(n-1, a, sum);
    }
}
