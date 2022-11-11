package Operations1111;

public class Main {

    public static void main(String[] args) {

        Operations operations = new Operations();
        // operations.enterNumbers();
        int add = operations.addition(5, 5);
        int subtract = operations.subtraction(5, 5);
        int multiply = operations.multiplication(5, 5);
        int divide = operations.division(5, 5);
        operations.showResults(5, 5, add, subtract, multiply, divide);

    }

}
