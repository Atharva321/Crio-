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


