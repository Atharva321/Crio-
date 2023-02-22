# Crio-
# Maths
## GCD
```
public int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }
```
```
public int gcd(int a, int b) {
   if (b==0) return a;
   return gcd(b,a%b);
}
```
### Euclidian GCD
```
public int egcd(int a, int b) {
    if (a == 0)
        return b;

    while (b != 0) {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }

    return a;
}
```

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
```
static class ItemValue {
        Double cost;
        double wt, val;
  
        public ItemValue(int wt, int val)
        {
            this.wt = wt;
            this.val = val;
            cost = (double)((double)val/(double)wt);
        }
    }
    
 static double fractionalKnapsack(int n, int capacity, int[] wt, int[] val) {

        ItemValue[] items = new ItemValue[n];
        for (int i = 0; i < n; i++) {
            items[i] = new ItemValue(wt[i], val[i]);
        }

        Arrays.sort(items, (obj1, obj2) -> Double.compare(obj2.cost , obj1.cost));


        double profit = 0;

        for(ItemValue item: items) {
            
            if (capacity == 0) break;

            if (capacity < item.wt) {
                profit += item.cost * capacity;
                break;  
            }

            profit += item.val;
            capacity -= item.wt;
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
# Recursion

## Generate Parenthesis
```
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
```
# Backtracking

## Word Search 1
```
public class WordSearch {
    int rowDir [] = {-1,1,0,0};
    int colDir [] = {0,0,-1,1};
    static boolean [][] checker;
    
    public boolean exist(char[][] board, String word) {
        boolean [][] checker = new boolean [board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++) {
            for(int j = 0 ; j < board[0].length;  j++) {
                tracker(checker);
                if(isFound(board, checker, word, i, j, 0)) return true;
            }
        }
        return false;
    }
    public boolean isFound(char[][] board,boolean[][] checker, String word, int row, int col, int i){
        if(row >= 0 && row < board.length && col >= 0 && col < board[0].length){
            if(board[row][col] == word.charAt(i) && checker[row][col] == false){
                //base case
                if(i == word.length() -1) return true;
                
                checker[row][col] = true;
                i++;
                
                return isFound(board, checker, word, row-1, col, i) 
                || isFound(board, checker, word, row+1, col, i) 
                || isFound(board, checker, word, row, col-1, i) 
                || isFound(board, checker, word, row, col+1, i);
            }
        }
        return false;
    }

    public void tracker(boolean[][] checker){
        for(int i=0; i<checker.length; i++){
            for(int j=0; j<checker[0].length; j++){
                checker[i][j] = false;
            }
        }
    }
```
# Graph
## Source to Destination Path
```
import java.util.*;

public class RouteBetweenNodes {
    // Implement Solution Here
    boolean routeBetweenNodes(int source , int destination ,int n,  ArrayList<ArrayList<Integer>> edges) {
        boolean [] visited = new boolean [n+1];
        
        //First create Adjacency List
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n+1);
        
        for(int i=0; i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

        // adding connections
        for(int i=0; i<edges.size(); i++){
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }

        return printAllPaths(visited, n, adj, source, destination);
    }

    public boolean printAllPaths(boolean [] visited, int V, ArrayList<ArrayList<Integer>> adj, int src, int destn){
        
        visited[src] = true;

        for(int nbr: adj.get(src)){
            
            if(nbr == destn){
                return true;
            }

            if(visited[nbr] != true) 
                if(printAllPaths(visited, V, adj, nbr, destn)) return true;
        }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int p = 0 ; p < t ; p++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
        
            for(int i=0;i<m;i++){
                edges.add(new ArrayList<Integer>());
                edges.get(i).add(scanner.nextInt());
                edges.get(i).add(scanner.nextInt());
            }
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            RouteBetweenNodes answer = new RouteBetweenNodes();
            boolean result = answer.routeBetweenNodes(src, dest,n,edges);
            if (result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        scanner.close();
    }
}
```

## Print All Paths in directed graph
```
class Solution {
    // Function to count paths between two vertices in a directed graph.
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                   int destination) {
        // Code here
        String path = "";
        int possiblePaths = 
        printAllPaths(V, adj, source, destination, path, 0);
        return possiblePaths;
    }
    
    public int printAllPaths(int V, ArrayList<ArrayList<Integer>> adj, int src, int destn, String path, int paths){
        if(src == destn){
            System.out.println(path);
            return 1;
        }
        
        
        for(int nbr: adj.get(src)){
                paths += printAllPaths(V, adj, nbr, destn, src + "->" + nbr, 0);
        }
        
        return paths;
    }
}
```

## BFS of Graph
```
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V+1];
        ArrayList<Integer> a = new ArrayList<>();
        Queue<Integer> q = new LinkedList<Integer>();
        int s = 0;
        q.add(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int cur = q.poll();
            a.add(cur);
            for(int i:adj.get(cur)){
                if(visited[i]==false){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        return a;
    }
}
```
