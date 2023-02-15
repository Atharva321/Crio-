// Time  : Very Complex
// Space : O(2^n)
import java.util.*;

public class BalancedBraces {
    ArrayList<String> ans = new ArrayList<>();
    ArrayList<String> balancedBraces(int n) {
        parenthesesGenerator(0, 0, "", n);
        return ans;
    }
    
    public void parenthesesGenerator(int open, int close, String  curr, int n){
        if(curr.length() == n*2){
            ans.add(curr);
            return;
        }
        if(open < n){
            parenthesesGenerator(open+1, close, curr+'(', n);
        }
        
        if(open > close) { 
            parenthesesGenerator(open, close+1, curr+')', n);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> answer = new BalancedBraces().balancedBraces(n);
        for(int i = 0 ; i < answer.size() ; i++) {
            System.out.println(answer.get(i));
        }
    }
}
