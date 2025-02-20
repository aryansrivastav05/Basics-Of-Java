import java.util.*;
public class printNumToN {
    public static void count(int n)
    {
        int count = 1;
        while(count<=n){
            System.out.println(count);
            count++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count");
        int x = sc.nextInt();
        count(x);
    }
}
