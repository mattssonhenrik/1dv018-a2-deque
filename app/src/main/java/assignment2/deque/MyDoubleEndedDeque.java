package assignment2.deque;

public class MyDoubleEndedDeque {
    MyNode head;
    MyNode tail;
    int listSize; 

    public int size() {
        return listSize;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
