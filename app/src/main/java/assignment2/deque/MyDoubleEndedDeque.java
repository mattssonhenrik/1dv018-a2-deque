package assignment2.deque;

public class MyDoubleEndedDeque<Element> {
    MyNode<Element> head;  
    MyNode<Element> tail;
    int listSize;

    public void addFirst(Element nodeValue) {
        MyNode<Element> newNode = new MyNode<>(nodeValue);
        if (head == null) {
            head = newNode;
            tail = newNode;
            listSize++;
        } else {
            newNode.nextNode = head; // Länka ihop första noden till andra noden (1 next)
            head.prevNode = newNode; // Länka ihop andra noden till första noden (2 prev)
            head = newNode; // ändra referens-variabeln för 'head' till newNode
            listSize++;
        }
    }

    public void addLast(Element nodeValue) {
        MyNode<Element> newNode = new MyNode<>(nodeValue);
        if (head == null) {
            head = newNode;
            tail = newNode;
            listSize++;
        } else {
            MyNode<Element> traverseNode = head;
            while (traverseNode.nextNode != null) {
                traverseNode = traverseNode.nextNode;
            }
            traverseNode.nextNode = newNode;
            newNode.prevNode = traverseNode;
        }
        listSize++;
    }

    public void removeFirst() {
        head = head.nextNode;
        listSize--;
    }

    public void removeLast() {
        tail = tail.prevNode;
        tail.nextNode = null;
        listSize--;
    }

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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        MyNode<Element> nodeValue = head;
        while (nodeValue != null) {
            stringBuilder.append(nodeValue.value);
            nodeValue = nodeValue.nextNode;
            if (nodeValue != null)
                stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MyDoubleEndedDeque<Integer> myQ = new MyDoubleEndedDeque<>();
        myQ.addFirst(1);
        System.out.println(myQ);
        myQ.addFirst(2);
        System.out.println(myQ);
        myQ.addFirst(3);
        System.out.println(myQ);
        myQ.addFirst(4);
        System.out.println(myQ);
        System.out.println(myQ.listSize);
        myQ.removeFirst();
        System.out.println(myQ);
        myQ.removeLast();
        System.out.println(myQ);
        System.out.println(myQ.listSize);
        myQ.addLast(5);
        System.out.println(myQ);
        System.out.println(myQ.listSize);
    }
}
