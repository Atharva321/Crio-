import java.util.*;

class LongestCommonSubstring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(longestCommonSubstring(s1,s2));
            t--;
        }
        sc.close();
    }

    static int longestCommonSubstring(String s1, String s2){
        int [][] dp = new int [s1.length()+1][s2.length()+1];
        for(int i=0; i<=s1.length(); i++){
            dp[i][0] = 0;
        }
        for(int i=0; i<=s2.length(); i++){
            dp[0][i] = 0;
        }

        int subString = 0;

        for(int i=1; i<=s1.length(); i++){
            for(int j=1; j<=s2.length(); j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    subString = Math.max(subString, dp[i][j]);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }

        return subString;
    }
}
