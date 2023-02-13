package doubleLinkedList;

public class MyLinkedList2<T> {
    private Node2<T> head;

    public void print() {
        Node2<T> node = head;
        if (node != null) {
            do {
                System.out.print(node.getData() + " ");
                node = node.getNext();
            } while (node.getNext() != head.getNext());
            System.out.println();
        }
    }

    public void pushToHead(T data) {
        Node2<T> node = new Node2<>(data);
        if (head != null) {
            node.setNext(head);
            node.setPrevious(head.getPrevious());
            head.getPrevious().setNext(node);
            head.setPrevious(node);
        } else {
            node.setNext(node);
            node.setPrevious(node);
        }
        head = node;
    }

    public void pushToTail(T data) {
        if (head == null) {
            pushToHead(data);
        } else {
            Node2<T> node = new Node2<>(data);
            node.setPrevious(head.getPrevious());
            head.getPrevious().setNext(node);
            node.setNext(head);
            head.setPrevious(node);
        }
    }

    public T removeHead() {
        T data = null;
        if (head != null) {
            data = head.getData();
            if (head.getNext() == head) {
                head = null;
            } else {
                head.getPrevious().setNext(head.getNext());
                head.getNext().setPrevious(head.getPrevious());
                head = head.getNext();
            }
        }
        return data;
    }

    public T removeTail() {
        T data = null;
        if (head != null) {
            if (head.getNext() == head) {
                data = head.getData();
                head = null;
            } else {
                data = head.getPrevious().getData();
                head.getPrevious().getPrevious().setNext(head);
                head.setPrevious(head.getPrevious().getPrevious());
            }
        }
        return data;
    }

    public T get(int index) {
        return (getNode(index) != null) ? (T) getNode(index).getData() : null;
    }

    public int size() {
        int size = 0;
        if (head != null) {
            Node2<T> last = head;
            while (last.getNext() != head) {
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
            Node2 node = getNode(index);
            Node2<T> newNode = new Node2<>(data);
            newNode.setData(data);
            newNode.setPrevious(node.getPrevious());
            newNode.getPrevious().setNext(newNode);
            node.setPrevious(newNode);
            newNode.setNext(node);

            isPushing = true;
        } else if (index == 0) pushToHead(data);
        else System.out.println("Index out of bound");
        return isPushing;
    }

    public T remove(int index) {
        T data;
        Node2<T> node = getNode(index);
        if (node == null) data = null;
        else if (size() == 1) {
            data = node.getData();
        } else {
            data = node.getData();
            node.getPrevious().setNext(node.getNext());
            node.getNext().setPrevious(node.getPrevious());
            if (index == 0) head = node.getNext();
            }
        return data;
    }

    public void reverse() {
        Node2<T> node = head;
        if (node != null) {
            Node2<T> temp;
            do {
                temp = node.getNext();
                node.setNext(node.getPrevious());
                node.setPrevious(temp);
                node = temp;
            } while (node != head);
            head = node.getNext();
        }

    }

    private Node2 getNode(int index) {
        Node2<T> node = null;
        if (head != null && index < size()) {
            int count = 0;
            int size = size();
            node = head;
            if (size / 2 >= index) {
                while (count < index) {
                    count++;
                    node = node.getNext();
                }
            } else {
                while (size - count > index) {
                    count++;
                    node = node.getPrevious();
                }
            }
        }
        return node;
    }
}
