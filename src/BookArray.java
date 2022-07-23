

public class BookArray {

    public static void main(String[]args) {

        Book[] libray = new Book[5]; //배열의 주소를 선언

        for(int i=0; i < libray.length; i++) {
            System.out.println(libray[i]);
        }
        libray[0] = new Book("태백산맥","조정래");
        libray[1] = new Book("데미안","헤르만 세세");
        libray[2] = new Book("ㅁㅁㅁ","ㅁㅁㅁㅁ");
        libray[3] = new Book("ㅁ","ㅁㅁ");
        libray[4] = new Book("ㅁ","ㄴ");

        for(int i=0; i < libray.length; i++) {
            System.out.println(libray[i]);
        }
        for(int i = 0; i<libray.length; i++) {
            libray[i].showBookInfo();
        }

    }
}
