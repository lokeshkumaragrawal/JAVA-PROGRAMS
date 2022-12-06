import java.util.Scanner;

public class BinarySearch {

    public static void main (String [] args)
    {   int [] arr ={10,20,30,40,50,60,70,80,90,100};
        boolean flag=false;
        Scanner a = new Scanner(System.in); 
        System.out.print("Enter the key that you wnat to search  => ") ;
        int key = a.nextInt();
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {   
            int mid = (low + high)/2;
            
            if(key==arr[mid]){
                System.out.println("Key => " + key +  " found at "+ mid);
                 flag=true;
                 break;
            }
            else if (key>arr[mid]){
                low=mid+1;
            }
            else if (key<arr[mid]){
                high=mid-1;
            }

        }
        if(flag==false)
        {
        System.out.println("KEY = " + key +" not Found ");
        }
    }
                        
}
