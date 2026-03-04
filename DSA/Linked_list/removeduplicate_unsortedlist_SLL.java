import java.util.*;
class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
class Linkedlist{
    Node head=null;
    void insert(int val){
        Node newnode =new Node(val);
        if(head==null){
            head=newnode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void removeduplicate(){
        Node current=head;
        while(current!=null){
            Node temp=current;
            while(temp.next!=null){
                if(temp.next.data==current.data){
                    temp.next=temp.next.next;
                }else{
                    temp=temp.next;
                }
            }
            current=current.next;
        }
    }
    void deletelast(int val){
        Node temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        int last=count-val;
        temp=head;
        for(int i=0;i<last;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    void swap(int one,int two){
        if(one ==two) return;
        Node node1=head;
        Node node2=head;
        for(int i=1;i<one;i++){
            node1=node1.next;
        }
        for(int i=1;i<two;i++){
            node2=node2.next;
        }
        if(node1!=null&&node2!=null){
            int temp=node2.data;
            node2.data=node1.data;
            node1.data=temp;
        }
    }
    void occurance(int c){
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(temp.data==c){
                count++;
            }
            temp=temp.next;
        }
        System.out.println(count);
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
   
}
public class removeduplicate_unsortedlist_SLL{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Linkedlist ll=new Linkedlist();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            ll.insert(v);
        }
        ll.removeduplicate();
        //int k=sc.nextInt();
        //ll.deletelast(k);
         // int one=sc.nextInt();
         // int two=sc.nextInt();
         // ll.swap(one,two);
       // int c=sc.nextInt();
        //ll.occurance(c);
        ll.display();
    }
}