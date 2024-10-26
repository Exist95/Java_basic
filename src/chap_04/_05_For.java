package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        for(int i =0; i<10; i++){
            System.out.println("나코입니다" + (i + 1));
        }

        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }

        for (int i = 5; i > 0; i-=1) {
            System.out.println(i);
        }
    }
}
