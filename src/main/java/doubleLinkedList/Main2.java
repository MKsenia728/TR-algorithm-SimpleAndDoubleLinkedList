package doubleLinkedList;

public class Main2 {
    public static void main(String[] args) {
        MyLinkedList2<Integer> list2 = new MyLinkedList2<>();

        //   pushToHead
        list2.pushToHead(15);
        list2.pushToHead(14);
        list2.pushToHead(13);
        System.out.println("pushToHead");
        list2.print();
        //   pushToTail
        System.out.println("pushToTail");
        list2.pushToTail(16);
        list2.pushToTail(17);
        list2.print();
        //   removeHead
        System.out.println("removeHead");
        System.out.println(list2.removeHead());
        list2.print();
//        removeTail
        System.out.println("removeTail");
        System.out.println(list2.removeTail());
        list2.print();
//        get
        System.out.println("get");
        System.out.println("0 " + list2.get(0));
        System.out.println("1 " + list2.get(1));
        System.out.println("2 " + list2.get(2));
        System.out.println("3 " + list2.get(3));

//        size
        System.out.println("Size : " + list2.size());

//        pushToIndex
        list2.pushToIndex(0,135);
        list2.pushToIndex(2,145);
        list2.pushToIndex(4,155);
        list2.pushToIndex(6,165);
        System.out.println("pushToIndex");
        list2.print();

//        remove
        System.out.println("remove");
        System.out.println(list2.remove(6));
        System.out.println(list2.remove(4));
        System.out.println(list2.remove(2));
        System.out.println(list2.remove(0));
        list2.print();

//        reverse()
        list2.reverse();
        System.out.println("reverse");
        list2.print();


    }
}
