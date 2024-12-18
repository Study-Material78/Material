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

   public  Node insert_pos(Node head,int pos,int value)
   {
     int len=length(head);
    if(pos<0 || pos>len+1)
    {
        System.out.println("invalid position");
    }
    else if(pos==0)
    {
        //System.out.print("hi");
       head=insert_head(head,value);
    }
    // else if(pos==len)
    // {
    //     insert_end(head,value);
    // }
    else
    {
        Node curr=head;
        for(int i=0;i<pos-1;i++) // i=1,pos=2
        {
            curr=curr.next;
        }
        Node new_node=new Node(value);
        new_node.next=curr.next;
        curr.next=new_node;

    }
    return head;
      
   }

   public int length(Node head)
   {
      int count=0;
      Node curr=head;
      while(curr!=null)
      {
        count++;
        curr=curr.next;
      }
      return count;
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
         
       head =list.insert_pos(head,0,77);
      head =list.insert_pos(head,5,79);
       head =list.insert_pos(head,2,100);
       head =list.insert_pos(head,7,200);


       //traversal
        list.display(head);

      



    }
 }