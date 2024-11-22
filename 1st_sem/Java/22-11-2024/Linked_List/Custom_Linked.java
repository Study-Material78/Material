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

// method for inserting the node
  public Node  insert_pos(Node head,int pos,int value)
  {
   

      int l=len(head);  //3
      Node new_node= new Node(value);
      if( pos<0 ||   pos>l+1 )               // pos<l
      {
          System.out.println("invalid position to insert");
      }
      else if(pos==0)
      {
        head=insert_head(head,value);
      }
      else
      {
        Node curr=head;
        for(int i=0;i<pos-1;i++)
        {
             curr=curr.next;
        }
        new_node.next=curr.next;
        curr.next=new_node;

      }
  return head;




  }



    public int len(Node head)
    {
        int length=0;
        Node curr=head;
        while(curr!=null)
        {
            length++;
            curr=curr.next;
        }
        return  length;
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
         list.insert_end(head, 40);
         list.insert_pos(head,3,100);

    
         
       //traversal
        list.display(head);

      



    }
 }