import java.util.Arrays;
public class ArraysUtil {

    public static void main (String [] args)
    {   
        int [] arr = new int [5];
        for (int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        Arrays.fill(arr,40);
        System.out.print("when fill is used \n");
        for (int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        Arrays.fill(arr,2,5,20);
        System.out.println("when fill with some condition");
        for (int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.print("after the sorting\n");
        for (int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        int res = Arrays.binarySearch(arr,20);
        System.out.println(res);
        
        res = Arrays.binarySearch(arr,10);
        System.out.println(res);
    }
                        
}
