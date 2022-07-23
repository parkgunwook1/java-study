package 추상상속;

public abstract class Computer { //abstract 메서드가 있으면 abstract 클래스가 되어야 한다.

    public abstract void display(); //추상 메서드.  하위클래스에 상속을 받아 위임을 한다.
    public abstract void typing();

    public void turnOn() { //일반 메서드
        System.out.println("전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }


}
