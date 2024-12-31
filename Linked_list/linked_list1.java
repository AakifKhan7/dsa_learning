package Linked_list;

public class linked_list1 {

    Node head;
    private int size;

    linked_list1(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first, last
    public  void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // print
    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // delete - first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    // delete - last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next; // head.next = null -> lastnode = 
        while(lastNode.next != null){ // null.next = null
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }   
        secondLast.next = null;
        size--;
    }

    // delete - at index
    public void deleteAtIndex(int index){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(index == 0){
            head = head.next;
            return;
        }

        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            if(temp == null){
                System.out.println("Index out of bound");
                return;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        linked_list1 list = new linked_list1();
        list.addFirst("a");
        list.addFirst( "is");
        list.addLast("list");
        list.print();

        list.addFirst("This");
        list.print();

        list.deleteFirst();
        list.print();

        list.deleteLast();
        list.print();

        list.deleteAtIndex(1);
        list.print();

        int size = list.getSize();
        System.out.println(size);
    }
}
