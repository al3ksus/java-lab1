package container;

import node.Node;
import node.SimplyLinkedListNode;


public class SimplyLinkedList<T> implements Container<T> {

    SimplyLinkedListNode<T> first;
    int size;

    /**
     * default constructor
     */
    public SimplyLinkedList() {
        this.size = 0;
    }

    /**
     * adds an element to the end
     * @param data element to be added to the end of the list
     */
    @Override
    public void add(T data) {
        SimplyLinkedListNode<T> node = new SimplyLinkedListNode<>(data);
        if (first == null) {
            first = node;
        } else {
            SimplyLinkedListNode<T> temp = first;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }

        size += 1;
    }

    /**
     * adds an element at the specified index
     * @param data element to be added
     * @param index index at which the element will be added
     */
    @Override
    public void add(T data, int index) {
        if ((index >= 0 && index < size) || index == 0) {
            SimplyLinkedListNode<T> node = new SimplyLinkedListNode<>(data);

            if (first == null) {
                if (index == 0) {
                    first = node;
                    size += 1;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                SimplyLinkedListNode<T> temp = first;
                int k = 0;

                if (index == 0) {
                    first = node;
                    first.next = temp;
                } else {
                    while (k != index - 1) {
                        temp = temp.next;
                        k += 1;
                    }

                    node.next = temp.next;
                    temp.next = node;
                }
                size += 1;
            }
        } else {
           throw new IndexOutOfBoundsException();
        }
    }

    /**
     * returns element by index
     * @param index index of the element to return
     * @return container element located at a given index
     */
    @Override
    public T get(int index) {
        if (first == null || index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            SimplyLinkedListNode<T> node = first;

            while (index != 0) {
                node = node.next;
                index -= 1;
            }

            return node.data;
        }
    }

    /**
     * removes an element by index
     * @param index index of the element to be removed
     */
    @Override
    public void remove(int index) {
        if (first == null || index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            first = first.next;
            size -= 1;
        } else {
            SimplyLinkedListNode<T> node = first;

            while (index != 1) {
                node = node.next;
                index -= 1;
            }

            node.next = node.next.next;
            size -= 1;
        }
    }

    /**
     * removes the specified container element
     * @param data element to be removed
     */
    @Override
    public void remove(T data) {
        if (first != null) {
            SimplyLinkedListNode<T> node = first;

            if (first.data == data) {
                first = first.next;
                size -= 1;
            } else {
                while (node.next.data != data) {
                    node = node.next;
                }

                node.next = node.next.next;
                size -= 1;
            }
        }
    }

    /**
     * prints the container to the console
     */
    @Override
    public void print() {
        SimplyLinkedListNode<T> node = first;

        while (node != null) {
            if (node.next == null) {
                System.out.println(node.data);
            } else {
                System.out.print(node.data + ", ");
            }

            node = node.next;
        }
    }
}
