package fastcampus;

import java.util.Scanner;

public class _21_ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int num = scan.nextInt();
        System.out.println("num = " + num);


        System.out.println("실수를 입력하세요:");
        float f = scan.nextFloat();
        System.out.println("float = " + f);

        System.out.println("문자열을 입력하세요:");
        String str = scan.next();
        System.out.println("str = " + str);

        scan.nextLine(); //버퍼비우기(스트림 비우기)

        System.out.println("문자열을 입력하세요:");
        String str2 = scan.nextLine();
        System.out.println("str = " + str2);

        scan.close();
    }
}
