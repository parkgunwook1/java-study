package 추상상속;

public abstract class DeskTop extends Computer {  //abstract 클래스 이며 컴퓨터 클래스를 extends로 상속받음

    public void display() { //추상 메서드를 가져와 속성을 정의
            System.out.println("DeskTop display");
    }
    public void typing() {
        System.out.println("DeskTop typing()");
    }

}
