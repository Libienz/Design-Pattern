import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyStack<E> implements Iterable<E> {

    class MyStackIterator implements Iterator {

        int index;

        public MyStackIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return stack.size() > index;
        }

        @Override
        public Object next() {
            Object o = stack.get(index);
            index++;
            return o;
        }
    }

    public MyStack() {
        stack = new ArrayList<E>();
    }

    ArrayList<E> stack;

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void push(E e) {
        stack.add(e);
    }
    public E pop() {
        E poped = stack.get(stack.size()-1);
        stack.remove((Integer) stack.size()-1);
        return poped;

    }

    @Override
    public Iterator iterator() {
        return new MyStackIterator();
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
