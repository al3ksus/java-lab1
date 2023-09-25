package node;

public class SimplyLinkedListNode<T> extends Node<T> {

    public SimplyLinkedListNode<T> next;

    /**
     * default constructor
     */
    public SimplyLinkedListNode() {
        this.data = null;
    }

    /**
     * constructor with data parameter
     * @param data the value that will store the list element
     */
    public SimplyLinkedListNode(T data) {
        this.data = data;
    }
}


