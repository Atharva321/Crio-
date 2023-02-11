# Crio-
# Custom Pair Comparator Tempalate
```
class Pair implements Comparable<Pair> {
    long distance;
    int x;
    int y;

    public Pair(long distance, int x, int y) {
        this.distance = distance;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair o) {
        return distance > o.distance ? 1 : -1;
    }
}

 PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
 // x : 1, y : 1
 pq.add(new Pair(distance, 1, 1));
```
# Greedy 
## Activity Selection
```
static int activitySelection(int n, int starting[], int ending[]){

        int[][] activities = new int [n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = starting[i];
            activities[i][1] = ending[i];
        }

        Arrays.sort(activities, 
            (a, b) -> (a[1] != b[1]) ? a[1] - b[1] : a[0] - b[0]);

        int count = 1;
        int prevEnd = activities[0][1];
        for (int i = 1; i < n; i++) {

            if (activities[i][0] >= prevEnd){
                count++;
                prevEnd = activities[i][1];
            }
        }

        return count;
    }
 ```
 ## Fractional KnapSack
 ```
 static class Pair {
        
        int weight;
        int value;

        public Pair(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

static double fractionalKnapsack(int n, int capacity, int[] wt, int[] val) {

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
```
# Sorting HashMap by Value
```
List<Integer> ans = new ArrayList<>();
Map<Integer, Integer> map = new HashMap<>();

for (int num: nums)
   map.put(num, map.getOrDefault(num, 0)+1);

List<Map.Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()) );

```
# Binary Tree Templates:
## Iterative:
## Pre-Order
```
// Time  : O(n)
// Space : O(n)

class Tree
{
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr = st.pop();
            ans.add(curr.data);
            if(curr.right != null){
                st.push(curr.right);
            }
            if(curr.left != null){
                st.push(curr.left);
            }
        }
        return ans;
    }
    
}
```

## Post-Order
```
// Time  : O(n)
// Space : O(n)

class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(node);
        while(!st.isEmpty()){
            Node curr = st.pop();
            
            ans.add(0, curr.data);
            if(curr.left != null){
                st.push(curr.left);
            }
            if(curr.right != null){
                st.push(curr.right);
            }
        }
        return ans;
    }
}
```

## In-Order
```
// Time  : O(n)
// Space : O(n)

class Solution
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        // Code
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;
        // left -> root -> right
        
        while(curr!=null || !st.isEmpty()){
            //curr = st.peek();
            while(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            ans.add(curr.data);
            curr = curr.right;
        }
        return ans;
    }
}
```
## Level Order
```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// Time  : O(n)
// Space : O(n)

class Solution {
    public List<List<Integer>> LevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                level.add(curr.val);
                
                if(curr.left!= null)   q.add(curr.left);
                if(curr.right!= null)  q.add(curr.right);
            }
      
            ans.add(level);
        }
        return ans;
    }
}
```


