import java.util.*;
class Node{
   int data;
   Node next;
   Node prev;
   Node(int val){
      this.data=val;
      this.prev=null;
      this.next=null;
   }
}
class Linkedlist{
   Node head=null;
   Node tail=null;
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
         newnode.prev=temp;
      }
   }
    boolean isPalindrome(){
      if(head == null||head.next == null) return true;

      Node left = head;
      Node right = head;

      while(right.next != null){
         right = right.next;
      }

      while(left != right && left.prev != right){
         if(left.data != right.data){
            return false;
         }
         left = left.next;
         right = right.prev;
      }
      return true;
   }

   
   void display(){
      Node temp=head;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
   }
}
public class palindrome_DLL{
   public static void main(String[]args){
      Scanner sc=new Scanner (System.in);
      Linkedlist ll=new Linkedlist();
      int k;
      while(true){
         k=sc.nextInt();
         if(k==-1)
         break;
         ll.insert(k);
      }
      if(ll.isPalindrome())
         System.out.print("Palindrome");
      else
         System.out.print("Not Palindrome");
      //ll.display();
   }
}
