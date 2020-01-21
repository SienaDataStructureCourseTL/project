/**
 * A binary search tree (BST) data structure for storing floating point
 * values. The tree has the property that for every node n, all values
 * in n's left subtree are less than or equal to n's data value and
 * all values in n's right subtree are larger.
 * 
 * Starter code by Siena College Faculty, modified by Pauline White
 * for CSIS 210, Spring 2018, modified by Jim Teresco for CSIS 210,
 * Fall 2019.
 *
 * @author (Your name here)
 * @version (Date)
 */
public class BinarySearchTree 
{
    private Node root;

    /**
     * Constructs an empty binary search tree (BST).
     */
    public BinarySearchTree() 
    {
        root = null;
    }

    /**
     * Inner class representing one node in a BST.
     */
    private class Node 
    {
        private double data;
        private Node left;
        private Node right;
	private int height;

        /**
         * Constructs a leaf node with a value.
         * 
         * @param data The data value for the node.
         */
        private Node(double data) 
        {
            this.data = data;
            this.left = null;
            this.right = null;
	    this.height = 0;
        }
    }

    /**
     * Adds the value to the tree maintianing the BST
     * property that for every tree node n, all values in n's left
     * subtree are less than or equal to n's data value and all values
     * in n's right subtree are larger.
     * 
     * @param value The value to be added to the BST.
     */ 
    public void add(double value) 
    {
        if (root == null) {
            root = new Node(value);
        }
	else {
            recursiveAdd(value, root);
        }
    }

    /**
     * Recursive method to add a value to a BST with root n.
     * 
     * Precondition: n is not null
     * @param value The value to be added to the BST.
     * @param n The root of the BST.
     */ 
    private void recursiveAdd(double value, Node n) 
    {
        if ((value > n.data) && (n.right == null)) {
            // value is added as the right child of n
            n.right = new Node(value);
        }
        else if ((value <= n.data) && (n.left == null)) {
            // value is added as the left child of n
            n.left = new Node(value);
        }
        else if ((value > n.data) && (n.right != null)) {
            // insert value into n's right subtree
            recursiveAdd(value, n.right);
        }
        else {
            // the following is true: ((value <= n.data) && (n.left != null))
            // insert value into n's left subtree
            recursiveAdd(value, n.left);
        }
	// update height as one of this node's children has grown
	if (n.left == null) n.height = n.right.height + 1;
	else if (n.right == null) n.height = n.left.height + 1;
	else n.height = Math.max(n.left.height, n.right.height) +1 ;
	
    }

    /**
       Return a String representation of the BinarySearchTree using an
       "ASCII art" style to show structure.

       @return String representation of the BinarySearchTree.
    */
    @Override
    public String toString() {

	if (root == null) return "Empty";
	StringBuffer result = new StringBuffer();
	toStringHelper(root, result, 0, "");
	return result.toString();	
    }

    /**
       Recursive helper method for toString, fills the StringBuffer s
       with information about the subtree rooted at n, which is at level l
       of the overall tree.

       @param n Root of the subtree to add to the output
       @param s StringBuffer where the result is being accumulated
       @param l The level of the overall tree of node n
       @param which String indicating whether the node is a left child ("L"),
       a right child ("R"), or the root ("")
    */
    private void toStringHelper(Node n, StringBuffer s, int l, String which) {

	if (which.equals("")) {
	    // append root
	    s.append(n.data + "\n");
	}
	else {
	    // append root of a L or R subtree at level l
	    for (int i = 0; i < l-1; i++) {
		s.append("|  ");
	    }
	    s.append("+" + which + "-" + n.data + "\n");
	}
	// append existing children
	if (n.left != null) toStringHelper(n.left, s, l+1, "L");
	if (n.right != null) toStringHelper(n.right, s, l+1, "R");
    }
    

    public int largestHeightImbalance() {

	// REPLACE THIS WITH YOUR OWN IMPLEMENTATION
	return 0;
    }
}
