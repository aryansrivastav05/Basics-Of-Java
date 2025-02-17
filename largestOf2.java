import java.util.*;
public class largestOf2 {
    public static void largest(int a , int b){
       
         if(a>b)
         {
            System.out.println(a+" is greater than "+b);
         }else{
            System.out.println(b+" is  greater than "+a);

         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  element");
        int a = sc.nextInt();
        System.out.println("Enter second  element");

        int b = sc.nextInt();
        largest(a,b);
    }
}
