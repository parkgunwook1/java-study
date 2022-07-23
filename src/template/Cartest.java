package template;

public abstract class Cartest {

    public static void main(String[]args) {

        Car myCar = new ManualCar();
            myCar.run();

        System.out.println("---------------");
        Car yourCar = new AiCar();
        yourCar.run();

    }
}
