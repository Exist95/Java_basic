package fastcampus.part2;

import java.util.Scanner;

public class _29_IfBasicTest {
    public static void main(String[] args) {
        int x = -10;
        if(x>0) {
            System.out.println("양수입니다.");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int num = scan.nextInt();
        if (num % 7 == 0) {
            System.out.println(num + "은 7의 배수입니다.");
        }

        System.out.println("종료");
    }
}
