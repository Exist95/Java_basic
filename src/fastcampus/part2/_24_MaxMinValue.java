package fastcampus.part2;

public class _24_MaxMinValue {
    public static void main(String[] args) {
        // 삼항 연산자를 이용하여 정수 2개 중 max 와 min value 출력.
        int a = 10;
        int b = 20;

        int min =  (a<b) ? a : b;
        System.out.println(min);

        int max = (a>b) ? a : b;
        System.out.println(max);
    }
}
