package doubleLinkedList;

public class Node2<T> {
    private T data;
    private Node2<T> next;
    private Node2<T> previous;

    public Node2(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node2<T> getNext() {
        return next;
    }

    public void setNext(Node2<T> next) {
        this.next = next;
    }

    public Node2<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node2<T> previous) {
        this.previous = previous;
    }
}
