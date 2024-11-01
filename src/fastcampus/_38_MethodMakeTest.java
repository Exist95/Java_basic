package fastcampus;

public class _38_MethodMakeTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int result = add(a, b);
        System.out.println(result);
    }
    // 매개변수 2개의 정수를 받아서 총합을 구하고 리턴하는 메서드를 정의하시오.
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
