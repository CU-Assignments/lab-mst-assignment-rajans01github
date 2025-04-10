// QUESTION 4:
// Implement a Java program that uses method overloading to perform different mathematical operations.

public class Question4_MethodOverloading {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Question4_MethodOverloading obj = new Question4_MethodOverloading();

        System.out.println("Addition (int): " + obj.add(10, 20));           // 30
        System.out.println("Addition (double): " + obj.add(2.5, 3.5));      // 6.0
        System.out.println("Multiply (2 args): " + obj.multiply(2, 3));     // 6
        System.out.println("Multiply (3 args): " + obj.multiply(2, 3, 4));  // 24
    }
}
