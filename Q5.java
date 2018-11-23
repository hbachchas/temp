interface BinaryArray{
    default/public/private int[] sort2inOn(arr);
}

interface TernaryArray{
    default/public/private int[] sort3inOn(arr);
}

public class HelloWorld implements BinaryArray, TernaryArray{
    
    public int[] sort2inOn(int[] arr){
        // count 0s, 1s in O(n)
    }
    
    public int[] sort3inOn(int[] arr){
        // count 0s, 1s, 2s in O(n)
    }

     public static void main(String []args){
         
        // declare arrays of (0,1) and (0,1,2)
        int arr_two[] = new int[5];         //declaration and instantiation 
        int arr_two[] = {1,0,0,1,1,1,0};    //declaration, instantiation and initialization
        int arr_three[] = {2,1,0,2,0,0,2,1,1,0,2,1,1,1,0};    //declaration, instantiation and initialization
        
        // instantiate two interfaces
        HelloWorld obj = new HelloWorld();
       
       // call two methods and sort them
        obj.sort2inOn(arr_three)
        obj.sort3inOn(arr_three)
     }
}
    
    
    
    
    
    
// take alphabet in uppercase from user, then convert it into lower-case
import java.util.Scanner;
import java.lang.Character;

public class HelloWorld{
     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        // (1)
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
       
        // (2)
        String str = sc.next();
        str.toLowerCase().charAt(0)
     }
}
