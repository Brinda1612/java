import java.util.Scanner;

public class marks {
    public static void main(String[] args) {

        Scanner M = new Scanner(System.in);
        System.out.print("enter mark maths :");
        int a = M.nextInt();
        System.out.print("enter mark phy :");
        int b = M.nextInt();
        System.out.print("enter mark bio :");
        int c = M.nextInt();
        System.out.print("enter mark eng :");
        int d = M.nextInt();
        int sum = a + b + c + d;
        int per = (sum * 100 / 400);
        System.out.println("total marks of :" + per);
    }
}
