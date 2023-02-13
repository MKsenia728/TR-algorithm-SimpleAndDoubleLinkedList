package simpleLinkedList;

public class Main {
    public static void main(String[] args) {
//        MyLinkedList<Integer> list = new MyLinkedList<>(new Node<>(10,null));

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.pushToHead(9);
        list.pushToHead(8);
        list.pushToHead(7);
        list.pushToTail(11);
        list.pushToTail(12);
        list.print();
//        list.removeTail();

//        System.out.println("tail remove " + list.removeTail());
//        System.out.println("tail remove " + list.removeTail());
//        System.out.println("tail remove " + list.removeTail());
//        System.out.println("tail remove " + list.removeTail());
//        System.out.println("tail remove " + list.removeTail());
//        System.out.println("tail remove " + list.removeTail());
//        System.out.println("tail remove " + list.removeTail());
//        System.out.println("tail remove " + list.removeTail());
//        System.out.println("+++");
        System.out.println(list.get(1));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println(list.get(4));
//        System.out.println(list.get(5));
//        System.out.println(list.get(6));


//        list.pushToIndex(2,9);
//        list.pushToIndex(0,6);
//        list.pushToIndex(6,111);
        list.print();
        System.out.println(list.size());
        System.out.println(list.remove(6));
        list.print();
        list.reverse();
        System.out.println("reverse");
        list.print();

    }
}
