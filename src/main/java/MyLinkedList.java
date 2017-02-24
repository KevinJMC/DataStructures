import java.util.LinkedList;

/**
 * Created by kevinmccann on 2/24/17.
 */
public class MyLinkedList<E> {

    void add(E element) {}

    void remove(E element) {}

    boolean contains(E element) {
        return false;
    }

    int find(E element) {}

    int size() {}

    E get(int index) {}

    MyLinkedList copy() {}

    void sort() {}

    void reverse() {}

    MyLinkedList slice(int fromIndex, int toIndex) {}

    public class MyNode<E> {
        E item;
        MyNode<E> next;

        @Override
        @SuppressWarnings("unchecked")
        public boolean equals(Object obj) {
            if (!(obj instanceof MyNode))
                return false;
            return item == ((MyNode) obj).item;
        }
    }
}
