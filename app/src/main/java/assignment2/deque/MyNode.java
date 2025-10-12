package assignment2.deque;

public class MyNode<Element> { 
    Element value;
    MyNode<Element> nextNode;
    MyNode<Element> prevNode;

    public MyNode(Element nodeValue) {
        this.value = nodeValue;
    }
}
