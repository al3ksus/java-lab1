package container;

import node.Node;

public interface Container<T> {
    /**
     * adds an element to the end
     * @param data element to be added to the end of the list
     */
    void add(T data);

    /**
     * adds an element at the specified index
     * @param data element to be added
     * @param index index at which the element will be added
     */
    void add(T data, int index);

    /**
     * returns element by index
     * @param index index of the element to return
     * @return container element located at a given index
     */
    T get(int index);

    /**
     * removes an element by index
     * @param index index of the element to be removed
     */
    void remove(int index);

    /**
     * removes the specified container element
     * @param data element to be removed
     */
    void remove(T data);

    /**
     * prints the container to the console
     */
    void print();
}
