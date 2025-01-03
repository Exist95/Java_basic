package fastcampus.part2;

// 자바는 객체(Object) 단위로 프로그래밍을 해야 한다 : 인간 중심 관점
// 자바는 클래스(Class) 단위로 프로그래밍을 해야 한다 : 프로그래밍 관점
// 메서드(Method) : 동장을 처리하는 함수(function)

// JVM => Java Virtual Machine
// Java의 첫 번째 큰 특징은 플랫폼 독립적인(OS 상관없이) 개발이 가능하다는 것
// 자동으로 메모리를 관리해준다는 것


public class _01_Calculator {
    public static void main1(String[] args) {
        int a, b, sum;
        a = 1;
        b = 1;
        sum = a+b;
        System.out.println(sum);
    }

    public static void main2(String[] args) {
        int a, b;
        a = 12;
        b = 2;
        System.out.println("a + b = " + (a+b));
        System.out.println("a + b = " + (a-b));
        System.out.println("a + b = " + (a*b));
        System.out.println("a + b = " + (a/b));
    }

    public static void main(String[] args) {
        int kor, eng, tot;
        kor = 77;
        eng = 87;
        tot = kor + eng;
        System.out.println("총점 : " + tot);
    }
}
