// Time  : O(n)
// Space : O(n)

import java.util.*;

class NextSmallerElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int [] ans = nextSmallerElement(arr, n);
		for (int i = 0; i < ans.length; i++)
			System.out.print(ans[i] + " ");
    }

    static int [] nextSmallerElement(int arr[], int n){
        int [] ans = new int [n];
        //System.out.println(n);
        if(arr.length == 1){
            //ans[0] = -1;
            return ans;
        }
        Stack<Integer> st = new Stack<>();
        ans[n-1] = -1;
        for(int i=n-1; i>=0; i--){
            if(st.isEmpty()){
                st.push(arr[i]);
                ans[i] = -1;
            }
            else if(arr[i] < st.peek()){
                st.push(arr[i]);
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
        }
        return ans;
    }
}
