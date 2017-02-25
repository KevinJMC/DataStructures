import java.util.LinkedList;

/**
 * Created by kevinmccann on 2/24/17.
 */
public class MyLinkedList<E> {

    private int size;
    private MyNode<E> first, last = null;

    void add(E element) {
        MyNode<E> lastNode = last;
        MyNode<E> newNode = new MyNode<>(element, null);
        last = newNode;
        if(lastNode == null) {
            first = newNode;
        } else { lastNode.next = newNode;}
        size++;
    }

    void remove(int index) {
        MyNode<E> holder = first;
        for(int i = 0; i<index;i++) {
            holder = holder.next;
        }
        if(holder.next.next == null)
            holder.next = null;
        holder.next = holder.next.next;
        size--;
    }

    boolean contains(E element) {
        MyNode<E> holder = first;
        while(holder.next != null) {
            if(holder.item == element)
                return false;
            holder = holder.next;
        }
        return true;
    }

    int find(E element) {
        int index = 0;
        for (MyNode<E> x = first; x != null; x = x.next) {
            if (element.equals(x.item))
                return index;
            index++;
        }
        return -1;
    }

    int size() {
        return size;
    }

    E get(int index) {
        MyNode<E> holder = first;
        for(int i = 0; i<=index;i++) {
            holder = holder.next;
        }
        return holder.item;
    }

    MyLinkedList<E> copy() {
        MyLinkedList<E> copyOfList = new MyLinkedList<>();
        copyOfList.first = null;
        for (MyNode<E> e = first; e != null; e = e.next)
            copyOfList.add(e.item);
        return copyOfList;

    }

    void sort() {

    }

    void reverse() {

    }

    MyLinkedList slice(int fromIndex, int toIndex) {
        MyLinkedList<E> slicedList = new MyLinkedList<E>();
        MyNode<E> stepper = first;
        for (int i = 0; i<fromIndex; i++) {
            stepper = stepper.next;
        }
        for (int i = fromIndex; i < toIndex; i++) {
            slicedList.add(stepper.item);
            stepper = stepper.next;
        }
        return slicedList;
    }

    public class MyNode<E> {
        E item;
        MyNode<E> next;

        MyNode(E element, MyNode<E> next) {
            this.item = element;
            this.next = next;
        }

        @Override
        @SuppressWarnings("unchecked")
        public boolean equals(Object obj) {
            if (!(obj instanceof MyNode))
                return false;
            return item == ((MyNode) obj).item;
        }
    }


}
