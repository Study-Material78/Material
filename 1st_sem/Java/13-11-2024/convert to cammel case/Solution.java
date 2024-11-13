import java.util.Scanner;
public class Solution{

    public static String cammelcase(String s)
    {
        String[] arr= s.trim().split(" ");
        
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i].toLowerCase();
            if(i==0)
            {
                str.append(arr[i]);
            }
            else
            {
                str.append (  Character.toUpperCase(arr[i].charAt(0)) +arr[i].substring(1)  );
            }
        }
        return str.toString();
    }
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();

            System.out.println("output:"+cammelcase(s));

    }
}