package 인터페이스;

public interface Calc { //인터페이스는 상수와 추상메서드가 생성된다.

    double PI = 3.14; //public static final이 자동으로 붙는다.
    int ERROR = -999999999;

    int add(int num1, int num2); //abstract가 자동으로 붙음.
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

}
