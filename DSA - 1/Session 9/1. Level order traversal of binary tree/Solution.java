import java.io.*;
import java.util.*;
import crio.ds.Tree.TreeNode;

/*
Definition of TreeNode
class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}

Use new TreeNode(data) to create new Node
*/
class Solution {
    public List<List<Integer>> binaryTreeLevelOrderTraversal(TreeNode root) {
        //if root is null then return null
        if(root == null) return null;
        
        //Intialise the list of list integer to store answer.
        List<List<Integer>> answer = new ArrayList<>();
        
        //Initialise the queue to store the levels
        Queue<TreeNode> levelNodes = new LinkedList<>();

        //Add root to the list
        levelNodes.add(root);

        //add to queue till queue is not empty.
        while(!levelNodes.isEmpty()){

            //size of the queue
            int size = levelNodes.size();

            //declare a list to store level values
            List<Integer> level = new ArrayList<>();

            for(int i=0; i < size; i++){
                //remove the node from queue
                TreeNode current = levelNodes.remove();
            
                level.add((int)current.val);

                //If left node exist then add it to queue
                if(current.left != null){
                    levelNodes.add(current.left);
                }

                //If right node exist then add it to queue
                if(current.right != null){
                    levelNodes.add(current.right);
                }
            }
            
            //add the complete level to answer arraylist
            answer.add(level);
        }

        return answer;
    }
}
/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output & extend it to test cases
Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving.
     a. Obvious logic, tests ability to convert logic to code
     b. Figuring out logic
     c. Knowledge of specific domain or concepts
     d. Knowledge of specific algorithm
     e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one
3. Get to a point where you can explain your approach to a 10 year old
4. Take a stab at the high-level logic & write it down.
5. Try to offload processing to functions & keeping your main code small.
Milestone 3: Code by expanding your pseudocode
1. Make sure you name the variables, functions clearly.
2. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
3. Use libraries as much as possible
Milestone 4: Prove to the interviewer that your code works with unit tests
1. Make sure you check boundary conditions
2. Time & storage complexity
3. Suggest optimizations if applicable
*/
