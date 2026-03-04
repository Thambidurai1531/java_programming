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
   static Node merge(Node h1,Node h2){
      if(h1==null) return h2;
      if(h2==null) return h1;
      Node dummy=new Node(0);
      Node tail=dummy;
       while(h1!=null&&h2!=null){
          if(h1.data<=h2.data){
             tail.next=h1;
             h1=h1.next;
          }else{
             tail.next=h2;
             h2=h2.next;
          }
          tail=tail.next;
       }
       if(h1!=null){
          tail.next=h1;
       }else{
          tail.next=h2;
       }
       return dummy.next;
   }
   static void display(Node head){
      Node temp=head;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
   }
}
public class merge_two_sorted_lists_to_one_sorted_list{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Linkedlist ll=new Linkedlist();
      Linkedlist l2=new Linkedlist();
      int k;
      while(true){
          k=sc.nextInt();
          if(k==-1)
          break;
          ll.insert(k);
      }
      while(true){
          k=sc.nextInt();
          if(k==-1)
          break;
          l2.insert(k);
      }
      Node mergehead=Linkedlist.merge(ll.head,l2.head);
      ll.display(mergehead);
   }
}