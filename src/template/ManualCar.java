package template;

public class ManualCar extends Car{

    public void drive() {
        System.out.println("시동이 운전합니다.");
        System.out.println("사람이 핸들을 조직합니다.");
    }
    public void stop() {
        System.out.println("사람이 브레이크로 정지합니다.");
    }
    public void wiper() {
        System.out.println("사람이 수동으로 조절 합니다.");
    }
}
