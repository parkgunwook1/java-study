package template;

public abstract class Car {

    public abstract void wiper();

    public abstract void drive();
    public abstract void stop();

    public void washCar() {}

    public void starCar() {
        System.out.println("시동을 켭니다.");
        }
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }
    public final void run() {
        //외부 클래스에서 재정의 할 수 없다
        // 템플릿 메서드이다. 템플릿 메서드는 하위클래스에서 변할수 없고 오버라이딩 재정의가 안되기 때문에 final클래스를 쓴다.
        starCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();

    }
}
