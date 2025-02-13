import java.util.*;
public class shortestPath {
    public static float getShortestPath(String path)
    {
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'n'){
                y++;
            }
            else if(dir == 's')
            {
                y--;
            }
            else if(dir =='w')
            {
                x--;
            }
            else{
                x++;
            }
             
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)(Math.sqrt(X2+Y2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directions");
        String path = sc.nextLine();
        System.out.println(getShortestPath(path));
    }
}
