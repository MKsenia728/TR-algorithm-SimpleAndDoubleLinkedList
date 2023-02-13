package simpleLinkedList;

public class MyLinkedList<T> {
    private Node<T> head;

    public void print() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public void pushToHead(T data) {
        Node<T> node = new Node<>(data);
        if (head != null) {
            node.setNext(head);
        }
        head = node;
    }

    public void pushToTail(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> last = getLast();
            last.setNext(node);
        }
    }

    public T removeHead() {
        T data = null;
        if (head != null) {
            data = head.getData();
            head = head.getNext();
        }
        return data;
    }

    public T removeTail() {
        T data = null;
        if (head != null) {
            if (head.getNext() == null) {
                data = head.getData();
                head = null;
            } else {
                Node<T> last = getLast();
                Node<T> preLast = head;
                while (preLast != null && preLast.getNext() != last) {
                    preLast = preLast.getNext();
                }
                data = preLast.getNext().getData();
                preLast.setNext(null);
            }
        }
        return data;
    }

    public T get(int index) {
        if (head == null) return null;
        else {
            int count = 0;
            Node<T> node = head;
            while (count < index && node != null && node.getNext() != null) {
                count++;
                node = node.getNext();
            }
            return (count != index) ? null : node.getData();
        }
    }

    public int size() {
        int size = 0;
        if (head != null) {
            Node<T> last = head;
            while (last.getNext() != null && last != null) {
                last = last.getNext();
                size++;
            }
            size++;
        }
        return size;
    }

    public boolean pushToIndex(int index, T data) {
        boolean isPushing = false;
        if (index > 0 && index < size()) {
            int current = 0;
            Node<T> node = head;
            while (current < index - 1) {
                current++;
                node = node.getNext();
            }
            Node<T> newNode = new Node<>(data);
            newNode.setData(data);
            newNode.setNext(node.getNext());
            node.setNext(newNode);
            isPushing = true;
        } else if (index == 0) pushToHead(data);
        else System.out.println("Index out of bound");
        return isPushing;
    }

    public T remove(int index) {
        T data;
        if (index < 0 || index > size() - 1) data = null;
        else if (index == 0) {
            data = head.getData();
            head = head.getNext();
        } else {
            int current = 0;
            Node<T> node = head;
            while (current < index - 1) {
                current++;
                node = node.getNext();
            }
            data = node.getNext().getData();
            node.setNext(node.getNext().getNext());

        }
        return data;
    }

    public void reverse() {
        Node<T> last = getLast();
        Node<T> node = head;
        if (node != null) {
            if (node != last) changeNext(node, last);
            head.setNext(null);
            head = last;
        }
    }

    private void changeNext(Node<T> node, Node<T> last) {
        if (node.getNext() == last) {
            last.setNext(node);
        } else {
            changeNext(node.getNext(), last);
            node.getNext().setNext(node);
        }
    }

    private Node<T> getLast() {
        Node last = head;
        while (last.getNext() != null && last != null) {
            last = last.getNext();
        }
        return last;
    }
}
