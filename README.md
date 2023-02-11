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
# Activity Selection
```

4.  Insert into Sorted Circular Linked List [Pattern introduction]
public ListNode insertIntoSortedCircularList(ListNode head,int insertVal)
	{
      ListNode newNode = new ListNode(insertVal);

      if (head == null) {
         newNode.next = newNode;
         return newNode;
      }
      
      ListNode curr = head;
      while(curr.next != head){

         if (
            // in between
            curr.val <= insertVal && insertVal <= curr.next.val ||
            // at begining 
            curr.next.val > insertVal && curr.val > curr.next.val ||
            // at end
            curr.val < insertVal && curr.val > curr.next.val
         ){
            break;
         }
         
         curr = curr.next;
      }

      newNode.next = curr.next;
      curr.next = newNode;

      return head;
8.  Merge 2 sorted linked lists
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode l3 = new ListNode(-1);
      ListNode curr = l3;

      while (l1 != null && l2 != null) {
        if (l1.val <= l2.val) {
          curr.next = l1;
          curr = curr.next;
          l1 = l1.next;
        }
        else {
          curr.next = l2;
          curr = curr.next;
          l2 = l2.next;
        }
      }

      if (l1 == null)
        curr.next = l2;

      if (l2 == null);
        curr.next = l1;

      return l3.next;
    }
11.  Intersection point of 2 lists
public static ListNode listIntersectionPoint(ListNode head1, ListNode head2)
{

        if (head1 == null || head2 == null)
            return null;
        
        ListNode p1 = head1;
        ListNode p2 = head2;
        
        while (p1 != p2) {
            p1 = (p1 != null) ? p1.next : head2;
            p2 = (p2 != null) ? p2.next : head1;
        }

        return p1;
	}
public static ListNode sumLists1( ListNode l1 , ListNode l2) {

    ListNode res = new ListNode(0);
    ListNode tail = res;

    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
      
      int sum = 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }

      sum += carry;
      tail.next = new ListNode(sum % 10);
      tail = tail.next;
      carry = sum / 10;
    }

    return res.next;
  }
//Right View of  Binary Tree

public class Solution {

    public ArrayList<Long> rightViewBinaryTree(TreeNode root) {
        ArrayList<Long> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
 
            // get number of nodes for each level
            int n = q.size();
 
            // traverse all the nodes of the current level
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.peek();
                q.remove();
 
                // print the last node of each level
                if (i == n - 1) {
                    ans.add(curr.val);
                }
 
                // if left child is not null add it into
                // the
                // queue
                if (curr.left != null) {
                    q.add(curr.left);
                }
 
                // if right child is not null add it into
                // the
                // queue
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return ans;    
    }
}
  */
public ListNode reverseEvenElements(ListNode head)
	{
		if (head == null || head.next == null) 
         return head;
      
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode curr = dummy;

      while (curr != null && curr.next != null) {


         if (curr.next.val % 2 == 0 ) {
            
            ListNode gEnd = curr.next;
            while(gEnd != null && gEnd.val % 2 == 0)
               gEnd = gEnd.next;

            curr = reverseList(curr, gEnd);
         }

        curr = (curr != null) ? curr.next : null;
      }

      return dummy.next;
	}

   ListNode reverseList(ListNode start, ListNode end) {
      
      ListNode newEnd = start.next;
      ListNode curr = start.next;
      ListNode prev = null;
      ListNode next = null;

      while (curr != end) {
         next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
      }

      newEnd.next = curr;
      start.next = prev;

      return newEnd;
   }
1. Balance a BST
4. Validate Binary Search Tree
8. Find Kth smallest element in a BST
https://github.com/Atharva321/Crio-/tree/main/DSA%20-
%203/Session%209
Top View
        ArrayList<Long> ans = new ArrayList<>();
        ArrayList<Long> rightAns = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
 
            // get number of nodes for each level
            int n = q.size();
 
            // traverse all the nodes of the current level
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.peek();
                q.remove();
 
                // the first node of each level
                if (i == 0) {
                    ans.add(curr.val);
                }

                // the last node of each level
                if (i == n - 1) {
                    rightAns.add(curr.val);
                }
 
                // if left child is not null add it into
                // the
                // queue
                if (curr.left != null) {
                    q.add(curr.left);
                }
 
                // if right child is not null add it into
                // the
                // queue
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        Collections.reverse(ans);
        // ans.add(root.val);
        // for(int i=0; i<rightAns.size(); i++){
        //     ans.add(rightAns.get(i));
        // }
        return ans;
public Node copyRandomList(Node head) {
        // duplicates Nodes
        Node tmp = head;
        while (tmp != null) {
            Node newNode= new Node(tmp.val, tmp.next, tmp.random);
            tmp.next = newNode;
            tmp = tmp.next.next;
        }


        // edit random linkes
        Node head2 = head.next;

        while (head2.next != null) {
            if (head2.random != null)
                head2.random = head2.random.next;
            
            head2 = head2.next.next;
        }
        if (head2.random != null)
            head2.random = head2.random.next;

        
        // seperate lists
        Node newHead = head.next;
        
        Node head1 = head;
        head2 = head.next;
        while (head2.next != null) {
            head1.next = head1.next.next;
            head1 = head1.next;

            head2.next = head2.next.next;
            head2 = head2.next;
        }
        head1.next = null;

        return newHead;
    }
static ArrayList<ArrayList<Integer>> kClosestPointsToOrigin(ArrayList<ArrayList<Integer>> points, int k){

        ArrayList<ArrayList<Integer>> closetPoints = new ArrayList<>();

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b.dist, a.dist) );

        int i = 0;
        for (ArrayList<Integer> point: points) {
            
            double dist = Math.sqrt((point.get(0)*point.get(0)) + (point.get(1)*point.get(1)));
            maxHeap.offer(new Pair(dist, i++));

            if (maxHeap.size() > k)
                maxHeap.poll();
        }

        while (maxHeap.size() != 0) {
            Pair curr = maxHeap.poll();
            ArrayList<Integer> point = points.get(curr.idx);
            closetPoints.add(point);
        }

        return closetPoints;
    }
// Implement your solution by completing the below function
    static List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums)
            map.put(num, map.getOrDefault(num, 0)+1);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(list, (Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) -> {
                
                return o2.getValue().compareTo(o1.getValue());
            });


        for (Entry<Integer, Integer> entry : list) {
            ans.add(entry.getKey());
            if (ans.size() == k) break;
        }

        return ans;

    }
static List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums)
            map.put(num, map.getOrDefault(num, 0)+1);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()) );

        for (var entry : list) {
            
            ans.add(entry.getKey());
            if (ans.size() == k) 
                break;
        }

        return ans;
    }
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
                // profit += ((double)(item.value / item.weight)) * capacity;
                profit += (item.value * ((double)capacity / (double)item.weight));
                break;  
                
            }

            profit += item.value;
            capacity -= item.weight;
        }

        return profit;
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
                // profit += ((double)(item.value / item.weight)) * capacity;
                profit += (item.value * ((double)capacity / (double)item.weight));
                break;  
                
            }

            profit += item.value;
            capacity -= item.weight;
        }

        return profit;
    }

Chetan Vyas has joined the document.
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


