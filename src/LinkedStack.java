import ficha3Xavi.EmptyCollectionException;

import javax.sound.sampled.Line;

public class LinkedStack<T> implements StackADT<T> {
    private LinearNode<T> top;
    private LinearNode<T> tail;

    public LinearNode<T> getNext() {
        return top;
    }

    private T element;

    public T getElement() {
        return element;
    }
    private int count;

    public LinkedStack(T element){
        top = null;
        count = 0;
    }

    public LinkedStack() {
        top = null;
        count = 0;
    }

    //push
    public void push(T element){
        LinearNode<T> temp = new LinearNode<T>(element);
        temp.setNext((top == null) ? tail : top);

        if(tail == null)
            tail = temp;

        top = temp;
        count++;

    }

    public boolean isEmpty(){
        return (count == 0);
    }

    public int size(){
        return count;
    }

    public T pop() throws EmptyCollectionException {
        if(isEmpty())
        throw new EmptyCollectionException("Stack");

        T result = top.getElement();
        top = top.getNext();
        count--;

        return result;
    }

    public T peek() {
        if(isEmpty())
            System.out.println("Stack is empty");

        return top.getElement();
    }

    public void setNext(LinearNode<T> next){
        this.top = next;
    }

    public String toString(){
        String result = "";
        LinearNode<T> temp = top;
        while(temp != null){
            result += temp.getElement() + "\n";
            temp = temp.getNext();
        }
        return result;
    }

    public void setNext(LinkedStack<T> next) {


    }

}

