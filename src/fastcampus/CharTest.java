package fastcampus;

public class CharTest {
    public static void main(String[] args) {

        // Q. '가'라는 한글 한 문자를 변수에 저장하고 출력하시오.
        char c = 'A';
        System.out.println(c); //A

        // A의 수치 값 (아스키코드가 들어감)
        int a = 'A';
        System.out.println(a); //65

        int b = 'B' + 1;
        System.out.println(b); //67
        System.out.println((char)b); //C

        char han = '가';
        System.out.println(han); //가
        int hanD = '가';
        System.out.println(hanD); //44032
        int hanU = '\uAC00';
        System.out.println(hanU); //44032
        System.out.println((char)hanU); //가

        // Q. 대문자 A를 문자 a로 반환하여 출력하시오.
        char upper = 'A';
        //casting
        char lower = (char)(upper + 32);
        System.out.println(lower); //a

        char lower1 = 'u'; //117
        int upper1 = lower1 - 32; //117 - 32
        System.out.println(upper1); //85
        System.out.println((char)upper1); //U

        // Q. '1'+'2'=3이 나오도록 프로그래밍 하시오.
        char i = '1';
        char j = '2';
        int sum = (i-48) + (j-48);
        System.out.println(sum); //3


    }
}
