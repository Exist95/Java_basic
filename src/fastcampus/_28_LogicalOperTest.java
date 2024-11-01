package fastcampus;

public class _28_LogicalOperTest {
    public static void main(String[] args) {
        // Q. 논리연산자의 결과 값을 쓰시오
        int x = 1, y = 0;
        System.out.println(!(x>0)); //false
        System.out.println(x>0 && x<3); //true
        System.out.println(x>0 && y<0); //false
        System.out.println(x<0 || y>=0);
    }
}
