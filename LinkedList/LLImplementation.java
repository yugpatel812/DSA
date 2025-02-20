package LinkedList;

public class LLImplementation {

    // structure of Node
    public static class Node {
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }
    }

    // main class  for LL implementation
    public static class linkedlist {
Node head =null;
 public  void insertAtBeg(int val){
     Node temp = new Node(val);
   if(head==null)
     head=temp;
   else
       head.next=temp.next;
       head=temp;
 }

 public void insertAnyIdx(int idx,int val){
     Node temp = new Node(val);
     if   (idx==0)     insertAtBeg(val);
     else if (idx==size()) insertEnd(val);
     else{
         int i=1; //you reach 1 node prev to target Node  after loop
         Node ptr =head;
         while( i!=idx){
          ptr=ptr.next;
           i++;
         }
         temp.next=ptr.next;
         ptr.next=temp;
      }
 }
 public void insertEnd (int val){
Node temp = new Node(val);
Node ptr =head;
while (ptr.next!=null){ //last node =temp Now
    ptr=ptr.next;
}
ptr.next=temp;
 }
 public int size(){
     Node temp= head;
     int count =0;
     while (temp !=null){
         count++;
         temp=temp.next;
     }
     return count;
 }
        public void display(){
            Node temp= head;

            while (temp !=null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtBeg(10);
        ll.insertEnd(30);
        ll.insertAnyIdx(1,20);
        ll.insertEnd(40);
      ll.display();
    }
}
