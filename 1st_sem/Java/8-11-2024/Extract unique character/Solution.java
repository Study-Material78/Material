
import java.util.HashSet;
import java.util.Scanner;
public class Solution{

    public static String unique(String s)
    {
       
        HashSet<Character> hasharr=new HashSet<>();
        StringBuilder result= new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(!hasharr.contains(c))
            {
                result.append(c);
                hasharr.add(c);
            }
        }
        System.out.println(hasharr);
        return result.toString();
    }

    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();

            System.out.println("output:"+unique(s));

    }
}