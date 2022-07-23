public class Company {

    private static Company instance = new Company(); // private static로 외부에서 못쓰고 하나인 인스턴스 이다.

    private Company(){}

        public static Company getInstance() { // 싱글톤 패턴으로 다른 클래스로 가져갈 수 있다.
          if(instance == null)
              instance = new Company();
        return instance;
        }


}
