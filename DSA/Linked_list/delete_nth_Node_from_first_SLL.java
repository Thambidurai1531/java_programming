import java.util.*;
class Node{
   int data;
   Node next;
   Node(int data){
      this.data=data;
      this.next=null;
   }
}

public class delete_nth_Node_from_first_SLL
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node head=null;
		Node tail=null;
		int k=sc.nextInt();
		for(int i=0;i<k;i++){
		   int v=sc.nextInt();
		   Node node=new Node(v);
		   if(head==null){
		      head=node;
		      tail=node;
		   }else{
		      tail.next=node;
		      tail=node;
		   }
		}
		int n=sc.nextInt();
// 		int count=0;
// 		Node temp=head;
// 		while(temp!=null){
// 		   count++;
// 		   temp=temp.next;
// 		}
		if(n==1||n<=0){
		   head=head.next;
		}else{
		  Node  temp=head;
		   for(int i=1;i<n-1;i++){
		      temp=temp.next;
		   }
		   temp.next=temp.next.next;
		}
		Node curr=head;
		while(curr!=null){
		   System.out.print(curr.data+" ");
		   curr=curr.next;
		}
	}
}