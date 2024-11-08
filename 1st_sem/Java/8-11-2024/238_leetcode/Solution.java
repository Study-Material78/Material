/import java.util.ArrayList;
import java.util.Arrays;
public class Solution{

    public static int[] pro(int[] nums)
    {
        int[] arr=new int[nums.length];
        int product=1;
        for(int value:nums)
        {
            product=value*product;
        }
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=product/nums[i];
        }
       
        return arr;
    }


    

    public static void main(String[] args)
    {
        int[] nums={1,2,3,4};
      
        System.out.println("output"+Arrays.toString(pro(nums)));
    }
        
}