import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of Pen");
        float penCost = sc.nextFloat();
        System.out.println("Enter the cost of Pencil");
        float pencilCost = sc.nextFloat();
        System.out.println("Enter the cost of Erasor");
        float erasorCost = sc.nextFloat();
        float totalCost = penCost + pencilCost + erasorCost;
        float bill = totalCost + (0.18f*totalCost);
        System.out.println("Bill is = "+bill);
    }

}
