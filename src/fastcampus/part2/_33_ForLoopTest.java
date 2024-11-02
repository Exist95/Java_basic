package fastcampus.part2;

public class _33_ForLoopTest {
    public static void main(String[] args) {
        // 반복문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력하시오.
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        for (char c = 'A'; c < 'Z'; c++) {
            System.out.println((int)c);
        }
        int[] numbers = {1,23,4,5,6,7,78,8,9,10};
        for (int su  : numbers) {
            System.out.println(su);
         }
    }
}
