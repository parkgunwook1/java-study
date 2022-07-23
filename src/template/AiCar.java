package template;

public class AiCar extends Car{

    public void drive() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 스스로 방향을 전환합니다");
    }
    public void stop() {
        System.out.println("자동차가 스스로 멈춥니다.");
    }
    public void wiper() {
        System.out.println("비와 눈의 양에 따라 자동으로 조절됩니다.");
    }
    public void washCar() {
        System.out.println("자동차가 세차 됩니다.");
    }


}
