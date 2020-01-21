import java.util.ArrayList;

/**
   Implementation of a Huffman Tree.  Expand this class comment appropriately.

   @author
   @version Fall 2019
*/

public class HuffmanTree implements Comparable<HuffmanTree> {

    /**
       Leaf node constructor.

       @param word the word represented at this leaf node.
       @param count the frequency of that word.
    */
    public HuffmanTree(String word, int count) {
        
        // ADD YOUR IMPLEMENTATION
    }

    /**
       Internal node constructor.

       @param left the left subtree for this node.
       @param right the right subtree for this node.
    */
    public HuffmanTree(HuffmanTree left, HuffmanTree right) {
        
        // ADD YOUR IMPLEMENTATION
    }

    /**
       Compare this HuffmanTree to another based on cumulative
       word frequencies of all leaf nodes within this subtree.

       @param other the other HuffmanTree to compare with.
       @return a positive value if this HuffmanTree contains words
       with a higher cumulative frequency than the other, a negative
       value if this HuffmanTree contains words with a lower
       cumulative frequency than the other, and 0 if both trees have
       the same cumulative frequency of words represented.
    */
    public int compareTo(HuffmanTree other) {
        
        // REPLACE WITH YOUR IMPLEMENTATION
        return 0;
    }

    /** 
	Construct and return a list of encodings, with each entry
	encapsulating a word, its encoding, and the word's frequency.

	@return The list of encodings.
    */
    public ArrayList<HuffmanCode> getEncodings() {

        // REPLACE THIS WITH YOUR IMPLEMENTATION.
        // Hint: use a recursive helper method to traverse the tree.
        return null;
    }


    /**
       Build and return a string suitable for storage in a file that
       represents the Huffman tree.  This is accomplished with a
       postorder traversal.

       @return the string representation of the tree
    */
    public String treeString() {

        // REPLACE THIS WITH YOUR IMPLEMENTATION.
        // Hint: a recursive helper method might prove useful here as well
	return "";
    }


    /**
       Print the decoded words based on the string passed as the parameter.
       This is accomplished by traversing the tree, going left when a 0 is
       encountered, right when a 1 is encountered, and printing the word
       when a leaf is encountered.

       @param code the encoded text to be decoded.
    */
    public void decode(String code) {

        // ADD YOUR IMPLEMENTATION.
    }
}
