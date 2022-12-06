import java.util.Scanner;
//to use Scanner class Scanner util  have  to import  

class LinearSearch{

    public static void main (String[] args){
        int [] arr={ 10,20,30 ,40,90,80,70,60,50};
        boolean flag=false;
        Scanner a = new Scanner ( System.in);
        System.out.print("Enter the key:>");
        int key = a.nextInt();
        for (int i =0 ; i<arr.length;i++)
        {
            if(key == arr[i])
            {
            System.out.println("KEY = " + key +" Found at " + i);    
               flag=true;
            break;
            }
        }
        if(flag==false)
        {
        System.out.println("KEY = " + key +" not Found ");
        }
    }
}