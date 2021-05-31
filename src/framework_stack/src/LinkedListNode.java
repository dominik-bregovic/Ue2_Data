package framework_stack.src;

/**
 * Class that implements the data structure singly linked list.
 *
 * @author Koitz-Hristov
 */
public class LinkedListNode {

    /**
     * Character stored within the node of the list.
     */
    private char value;

    /**
     * Successor of said node; i.e. this is a reference
     * to the next node within the list.
     */
    private LinkedListNode successor;


    /**
     * Generates a new LinkedListNode element with corresponding
     * char value and successor.
     * @param value character value
     * @param successor successor node
     */
    public LinkedListNode(char value, LinkedListNode successor) {
        this.value = value;
        this.successor = successor;
    }

    /**
     * Returns the value of the node.
     * @return character value
     */
    public char getValue() {
        return this.value;
    }

    /**
     * Sets the value of the node.
     * @param value character value
     */
    public void setValue(char value) {
        this.value = value;
    }

    /**
     *  Returns the successor of the node.
     * @return successor node
     */
    public LinkedListNode getSuccessor() {
        return this.successor;
    }

    /**
     * Sets the successor of the node.
     * @param successor successor node
     */
    public void setSuccessor(LinkedListNode successor) {
        this.successor = successor;
    }
}
