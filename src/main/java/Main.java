import container.SimplyLinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SimplyLinkedList<Integer> list = new SimplyLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.print();

        list.add(10, 2);

        list.print();

        list.remove(2);

        list.print();

        System.out.println(list.get(3));
    }
}
