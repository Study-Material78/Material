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

   //insert at head
   Node insert_head(Node head,int value)
   {
        Node new_node=new Node(value);
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
        }
        return head;

   }
   //insert at end
    void  insert_end(Node head,int value)
    {
         Node new_node=new Node(value);
        if(head==null)
        {
           head=new_node;

        }
        else
        {
           
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=new_node;
        }
    }

    //insert at particular position
    void insert_pos(Node head,int value,int pos)
    {
          int len=length(head);  //len=6
         if(pos<0 || pos>len)
         {
            System.out.println("invalid position");
         }
         else if( pos==0)
         {
            insert_head(head,value);
         }
         else
         {
            Node new_node=new Node(value);
            int count=0;
            Node curr=head;
             while(curr!=null)
             {
                count++; 
                if(count==pos)
                 {
                  new_node.next=curr.next;
                  curr.next=new_node;
                  break;
               }
               
               curr=curr.next;
             }



         }
   

        // int count=1;
        // Node curr=head;
        // Node new_node=new Node(value);
        // if(curr==null && pos>1 || pos<1)
        // {
        //     System.out.println("invalid position");
        //     return ;
        // }
        // else if(curr==null && pos==1)
        // {
        //     insert_head(head,value);
        // }
        //  int leng= length(head);
        //  if(pos>leng)
        //  {
        //      System.out.println("invalid position");
        //      return ;
        //  }
        // else
        // {
        //      while(curr.next!=null)
        //      {
        //     count++;
        //     if(count==pos)
        //     {
        //         new_node.next=curr.next;
        //         curr.next=new_node;
        //         break;
        //     }
        //     curr=curr.next;
        //       }

        // }
       
    }

   // method to check length of linked list

    int  length(Node head)
    {
        Node curr=head;
        int count=0;
        while(curr.next!=null)
        {
            count++;
            curr=curr.next;
        }
        count=count+1;
      //  System.out.println("length of linked list is:"+count);
        return count;
    }

    //display method
    void display(Node head)
    {
        Node curr=head;
        if(curr==null)
        {
            System.out.println(" linked list is empty");
        }
        while(curr.next!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println(curr.data);
    }

}
 public class Custom_Linked{
    public static void main(String[] args)
    {

        linked_operation list=new linked_operation();

        //insert at head
         Node head=null;
         head=list.insert_head(head,10);
         head=list.insert_head(head,20);
         head=list.insert_head(head,30);

        //insert at end
        list.insert_end(head,50);
        list.insert_end(head,60);

        //insert at particular position
        list.insert_pos(head,100,4);
       list.insert_pos(head,78,6);
        // list.insert_pos(head,100,8);

       //lenght of linked List
    //   list.length(head);

         list.display(head);



    }
 }














  //  Node node1=new Node(10);
        //  Node node2=new Node(20);
        //  Node node3=new Node(30);

        //  node1.next=node2;
        //  node2.next=node3;
        //  node3.next=null;


