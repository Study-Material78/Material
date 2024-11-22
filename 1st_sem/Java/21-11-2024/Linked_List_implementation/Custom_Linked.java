class Node{
    int data;
    Node next;

    Node(int value)
    {
            this.data=value;
            this.next=null;
    }
}





class linked_operation
{


    
    public Node insert_head(Node head,int value)
    {
            Node new_node=new Node(value);
           
             if(head==null)
             {
                head= new_node;
             }
             else
             {
                 new_node.next=head;
                 head=new_node;

             }
             return head;
    }
   
   //adding node at tail
    public void  insert_end(Node head,int value)
    {
        Node new_node =new Node(value);
        if(head==null)
        {
            head=new_node;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
         curr.next=new_node;

    }


     //traversal
     public  void  display(Node head)
     {
         Node curr=head;
         while( curr.next!=null)
         {
            System.out.print(curr.data+"-->");
            curr=curr.next;
         }
         System.out.print(curr.data);


     }




}
 public class Custom_Linked{
    public static void main(String[] args)
    {
       linked_operation list=new linked_operation();
       Node head=null;

       //insert at head
       head=list.insert_head(head,20);  //node 1
       head=list.insert_head(head,10);
        head=list.insert_head(head,5);


        // insert  at tail
         list.insert_end(head, 30);


       //traversal
        list.display(head);

      



    }
 }