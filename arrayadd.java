import java.util.*;

public class arrayadd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        int arrlength = a.length;
        int sum = 0;

        for (int i = 0; i < arrlength; i++) {
            System.out.println("enter number :");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < arrlength; i++) {
             sum = sum + a[i];
            }
            
        System.out.println("sum is = " + sum);
        System.out.println("avg is = " + sum / arrlength);

    }
}