import java.util.*;
public class calculator{
    public static void calculate(int a , int b , char operator)
    {
         
       switch (operator) {
        case '+': System.out.println(a+b); break;
        case '-': System.out.println(a-b); break;
        case '*': System.out.println(a*b); break;
        case '/': System.out.println(a/b); break;
        case '%': System.out.println(a%b); break;
            
            
       
        default:System.out.println("Invalid Input"); break;
           
       }



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Element");
        int a = sc.nextInt();
        System.out.println("Enter the second Element");
        int b = sc.nextInt();
        System.out.println("Enter the Operator ");
        char Operator = sc.next().charAt(0);
        calculate(a,b,Operator);
    }
}