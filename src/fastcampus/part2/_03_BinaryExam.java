package fastcampus.part2;

public class _03_BinaryExam {
    public static void main(String[] args) {
        // Q. 123을 10진수, 2진수, 8진수, 16진수로 출력하시오.

        int decimal = 69;
        System.out.println("decimal = " + decimal);
        System.out.println("binary = " + Integer.toBinaryString(decimal));
        System.out.println("octal = " + Integer.toOctalString((decimal)));
        System.out.println("hexa = " + Integer.toHexString(decimal));
    }
}
