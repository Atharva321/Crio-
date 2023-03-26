// Time  : O(n)
// Space : O(1)

import java.util.*;

class WiggleSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        List<Integer>ans = wiggleSort(n,nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }

    static List<Integer> wiggleSort(int n, List<Integer>nums){
        for(int i=0; i<n-1; i++){
            if((i%2==0 && nums.get(i)>nums.get(i+1)) || (i%2!=0 && nums.get(i)<nums.get(i+1))){
                //swap
                int num = nums.get(i);
                nums.set(i, nums.get(i+1));
                nums.set(i+1, num);
            }
        }
        return nums;
    }
}

/* 
*Type down* an example or two to confirm your understanding of the input/output & extend it to test cases
  1 5 1 1 6 4
  0 1 2 3 4 5
  1 4 1 5 1 6
   
   even index: i < i+1
   odd index : i > i+1 
  */
