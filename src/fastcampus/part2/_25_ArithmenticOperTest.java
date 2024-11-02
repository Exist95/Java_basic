package fastcampus.part2;

public class _25_ArithmenticOperTest {
    public static void main(String[] args) {
        // Q. 나누기와 나머지 연산자의 활용
        int digit = 3625;
        System.out.println(digit % 10); //일의 자리
        System.out.println(digit / 10 % 10); //십의 자리
        System.out.println(digit / 100 % 10); //백의 자리
        System.out.println(digit / 1000 % 10); //천의 자리

        int num = 2579;

        int su = 5;
        if(su % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
