import java.util.*;
class Node{
    int data;
    Node next;
    Node (int val){
        this.data=val;
        this.next=null;
    }
}
class Linkedlist{
    Node head=null;
    void insert(int  val){
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
    void split(){
        int count=0;
        Node cur=head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        int mid= (count+1)/2;
        Node temp=head;
        for(int i=0;i<mid;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        for(int i=mid;i<count;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Equal_split_SLL{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Linkedlist ll=new Linkedlist();
        int v;
        while(true){
            v = sc.nextInt();
            if(v == -1)
                break;
            ll.insert(v);
        }
        ll.split();
        // ll.display();
    }
}