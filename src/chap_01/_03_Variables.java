package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        int hour = 15;
        name = "나도코딩";

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5; //실수 값
        char grade = 'A'; //한글자만 표현할 때
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass );
        
        double d = 3.14123123123;
        float f = 3.14123123123F; //숫자 뒤 F or f를 붙일 것.

        System.out.println(d); //3.14123123123 => 깊은 소수점까지 필요하다면 double 사용할 것.
        System.out.println(f); //3.1412313

        long I = 100000000000L; //long 자료형은 뒤에 L을 붙일 것, 21억 초과 시 long 사용
        long l = 1_000_000_000_000L; //컴퓨터는 위와 동일하게 인식
        System.out.println(I);
        System.out.println(l);
    }
}
