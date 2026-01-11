**Factorial:** The factorial of a number is the product of all positive integers from 1 to that number, denoted by `n!`.

#EXAMPLE PROGRAM:
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
