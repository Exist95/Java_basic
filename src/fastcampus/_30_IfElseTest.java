package fastcampus;

import java.util.Scanner;

public class _30_IfElseTest {
    public static void main(String[] args) {
        int x = 10;
        if(x>=0) {
            System.out.println("0 or 양수입니다.");
        } else {
            System.out.println("음수입니다.");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요");
        int su = scan.nextInt();
        if(su % 2 == 0){
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
