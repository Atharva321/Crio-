import java.util.*;


class MinimumPlatforms{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arrival[]=new int[n];
        int departure[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arrival[i]=sc.nextInt();
            departure[i]=sc.nextInt();
        }
        System.out.println(minimumPlatforms(n,arrival,departure));

    }

    static int minimumPlatforms(int n, int arrival[], int departure[]){
        Arrays.sort(arrival);
        Arrays.sort(departure); 
        int maxPlatforms  = 1;
        int busyPlatforms = 1;

        int i=1;
        int j=0;
        while(i<n && j<n){
            if(arrival[i] <= departure[j]){
                busyPlatforms++;
                i++;
            }
            else if(arrival[i] > departure[j]){
                busyPlatforms--;
                j++;
            }

            if(maxPlatforms < busyPlatforms){
                    maxPlatforms = busyPlatforms;
            }
        }
        return maxPlatforms;
    }
}
