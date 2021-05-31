package framework_stack.src;

/**
 * Class that implements the data structure stack via a singly linked list.
 * Implement at least the methods push and pop.
 * You are not allowed to use any class belonging to Java collection.
 */
public class MyStack {

    /** Creates a new "empty" top element aka the base of the stack, which
     we identify with the char 'N'.
     */
    public LinkedListNode top=new LinkedListNode('N',null);

    /**
     * Pushes a character onto the stack, making it the new top
     * element.
     * @param value char to be new top element
     */
    public void push(char value){
        //TODO
        top.setSuccessor(new LinkedListNode(value, top.getSuccessor()));
    }

    /**
     * Removes the top element from the stack and
     * return it.
     * @return previous top stack element
     */
    public char pop(){
        //TODO
        return top.getValue();
    }

    /**
     * Generates a String representation of the stack, such that
     * the top of the stack is the leftmost element of the
     * returned string.
     * @return String representing the stack
     */
    public String toString(){
        StringBuilder return_str= new StringBuilder();
        LinkedListNode node = top;
        while(node.getValue()!='N'){
            return_str.append(node.getValue()).append(" ");
            node = node.getSuccessor();
        }
        return_str.append("\n");
        return return_str.toString();
    }
}
