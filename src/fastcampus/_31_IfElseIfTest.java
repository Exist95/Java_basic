package fastcampus;

public class _31_IfElseIfTest {
    public static void main(String[] args) {
        // 80점 이상의 학생 중에서 90점 이상은 A반, 85점 이상은 B반, 그렇지 않으면 C반, 80점 미만은 불합격으로 처리하시오.
        // 단, 점수는 0 ~ 100 점 사이 값으로 받는다.

        int jumsu = 184;
        if(jumsu >= 0 && jumsu <= 100){
            if(jumsu >= 90) {
                System.out.println("A반");
            } else if (jumsu >= 85) {
                System.out.println("B반");
            } else {
                System.out.println("C반");
            }
        } else {
            System.out.println("유효한 점수가 아닙니다.");
        }
    }
}
