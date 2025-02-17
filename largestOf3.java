import java.util.*;
public class largestOf3 {
    public static void largest(int a , int b,int c){
       
         if(a>b && a>c)
         {
            System.out.println(a+" is largest");
         }else if(b>a && b>c){
            System.out.println(b+" is largest");

         }
         else{
            System.out.println(c+" is largest");

         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  element");
        int a = sc.nextInt();
        System.out.println("Enter second  element");

        int b = sc.nextInt();
        System.out.println("Enter third  element");

        int c = sc.nextInt();
        largest(a,b,c);
    }
}

    

