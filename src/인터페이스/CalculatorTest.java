package 인터페이스;

public class CalculatorTest {

    public static void main(String[]args) {

        int num1 = 10;
        int num2 = 2;

        Calculator calc = new CompletCalc();

        System.out.println(calc.add(num1,num2));

    }
}
