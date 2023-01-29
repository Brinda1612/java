import java.util.*;

class factorial{

  static int factorial(int n) {
    if (n == 0) return 1;
    else return (n * factorial(n - 1));
  }

  public static void main(String[] args) {
    System.out.printf("enter the number :- ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.println("Factorial of " + num + " is = " + factorial(num) + "\n");
  }
}
