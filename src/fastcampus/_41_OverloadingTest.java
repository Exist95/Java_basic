package fastcampus;

// 하나의 클래스 내에서 동일한 이름의 메서드를 여러 개 사용할 수 있는 객체지향 기법
// 동작이 비슷하기 떄문에 메서드 이름을 같게 만들어 사용하면 편리하다.
// 오버로딩의 전제조건 -> 메서드의 시그니처가 달라야한다.
// 매개변수의 개수, 매개변수의 타입
// 실행속도가 떨어질 수도 있음 -> 그런데 왜 쓸까? -> 정적 바인딩(컴파일 시점에서 사용될 메서드가 결정되는 바인딩)으로 인해 문제 없음

public class _41_OverloadingTest {
    public static void main(String[] args) {
        float v = add(3.56f, 123.4f);
        int s = add(2, 4);
        System.out.println(v);
        System.out.println(s);
    }

    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static float add(float a, float b){
        float sum = a+b;
        return sum;
    }
}
