import java.util.Scanner;
import java.util.HashSet;
public class Same{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
         int n2=sc.nextInt();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int i=0;i<n1;i++)
        {
            set1.add(arr1[i]);
        }
        for(int i=0;i<n2;i++)
        {
            set2.add(arr2[i]);
        }
        System.out.println(set1);
          System.out.println(set2);
        
        if(set1.equals(set2))
        {
             System.out.println("true");
        } 
        else
        {
             System.out.println("false");
        }      
       
    }
}


