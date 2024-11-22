
import java.util.LinkedList;

public class Inbuilt_List{

    public static void main(String[] args)
    {
         LinkedList<Integer> list=new LinkedList<Integer>();
         list.add(10);
         list.add(20);
          list.addFirst(30);
          list.addLast(40);

        list.add(8,60);

         System.out.println(list);

    }


}