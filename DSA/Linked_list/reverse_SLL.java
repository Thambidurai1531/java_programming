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
        Node newnode=new Node(val);
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
    void reverse(){
        Node cur=head;
        Node prev=null;
        Node next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
    }    
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class reverse_SLL{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Linkedlist ll=new Linkedlist();
        //int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     int k=sc.nextInt();
        //     ll.insert(k);
        // }
        int v;
        while(true){
            v = sc.nextInt();
            if(v == -1)
                break;
            ll.insert(v);
        }
        ll.reverse();
        ll.display();
    }
}