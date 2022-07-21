import java.util.*;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    
    //inserting node to the list
    public void insert(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            return;
        }
        Node tail = head;
        // finding last node of the list
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = node;
    }

    // remove the first occurance of data
    public int remove(int data){
        Node prev_node = null;
         Node current_node = head;
         while(current_node != null){
            if(current_node.data == data){
                if(prev_node == null){
                    head = current_node.next;
                    return current_node.data;
                }
                prev_node.next = current_node.next;
                return current_node.data;
            }
            prev_node = current_node;
            current_node = current_node.next;
        }
        return -1; // if No elements found returning -1
    }

    //print linkedList data
    public void printList(){
        Node current_node = head;
         while(current_node != null){
            System.out.println(current_node.data+" ");
            current_node = current_node.next;
        }
    }

}

// Driver class for LinkedList;
public class LinkedListDriver{
     public static void main(String args[]){
        System.out.println("-------LinkedList----------");
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        System.out.println("Before Removing");
        list.printList();
        list.remove(15);
        list.remove(40);
        System.out.println("After Removing");
        list.printList();
    }
}

