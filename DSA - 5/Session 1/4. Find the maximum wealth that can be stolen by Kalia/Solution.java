// Time  : O(n)
// Space : O(n)

import java.util.*;
class HouseThief {
	public static long houseThief(int n, int [] houses) {
          if(houses.length == 0){
            return 0;
        }
        int[] dp = new int[houses.length+1];
        dp[0] = 0;
        dp[1] = houses[0];
        for(int i=1; i < houses.length; i++){
            dp[i+1] = Math.max(dp[i], dp[i-1] + houses[i]);
        }
        return dp[houses.length];
	}

	public static void main(String []args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int [n];
		for ( int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long ans = houseThief(n, arr);
		System.out.println(ans);

	}
}
