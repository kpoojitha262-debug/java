**Fibonacci series:** A sequence of numbers in which each number is the sum of the two preceding numbers, starting with 0 and 1.
  
#EXAMPLE PROGRAM
  public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
