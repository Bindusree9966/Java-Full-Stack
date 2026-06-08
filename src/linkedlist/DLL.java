package linkedlist;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    void addFirst(int value) {
        Node node = new Node(value);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    void addLast(int value) {
        if (tail == null) {
            addFirst(value);
            return;
        }

        Node node = new Node(value);

        tail.next = node;
        node.prev = tail;
        tail = node;

        size++;
    }

    void insert(int index, int value) {

        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size) {
            addLast(value);
            return;
        }

        Node temp = get(index);

        Node node = new Node(value);

        node.next = temp;
        node.prev = temp.prev;

        temp.prev.next = node;
        temp.prev = node;

        size++;
    }

    int deleteFirst() {

        if (head == null) {
            return -1;
        }

        int val = head.value;

        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        size--;

        return val;
    }

    int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }

        int val = tail.value;

        tail = tail.prev;
        tail.next = null;

        size--;

        return val;
    }

    int delete(int index) {

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node temp = get(index);

        int val = temp.value;

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;

        return val;
    }

    Node get(int index) {

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    void displayReverse() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }

        System.out.println("START");
    }

    private class Node {

        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        DLL list = new DLL();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);

        list.display();

        list.addLast(50);
        list.addLast(60);

        list.display();

        list.insert(2, 100);

        list.display();

        list.deleteFirst();

        list.display();

        list.deleteLast();

        list.display();

        list.delete(2);

        list.display();

        System.out.println("Size = " + list.size);

        System.out.println("Reverse Traversal:");
        list.displayReverse();
    }
}