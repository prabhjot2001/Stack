package stack;

public class Stack {
    private class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    int size =0;
    Node head =null;

    private boolean isempty(){
        return head == null;
    }

    public void push(int data)
    {
        Node node = new Node(data);
        if(isempty())
        {
            head = node;
            size++;
        }
        else
        {
            node.next = head;
            head = node;
            size++;
        }
    }

    public int pop()
    {
        if(isempty())
        {
            return -1;
        }
        else{
            int temp = head.data;
            head = head.next;
            size--;
            return temp;
        }
    }

    public int peek()
    {
        if(isempty())
        {
            return -1;
        }
        else
        {
            return head.data;
        }
    }

    public void printStack()
    {
        Node it = head;
        while(it != null)
        {
            System.out.println(it.data);
            it = it.next;
        }
    }
}
