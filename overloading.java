class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(2, 3));      
        System.out.println(calc.multiply(2.5, 3.5));   
    }
}
