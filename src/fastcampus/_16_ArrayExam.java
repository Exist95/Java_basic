package fastcampus;

public class _16_ArrayExam {
    public static void main(String[] args) {
        // 정수 1개를 저장할 변수를 선언하세요.
        int a;
        a = 10;
        // 정수 3개를 저장할 변수를 선언하세요.
        int[] b = new int[3];
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        int[] x = {1,2,3,4,5}; // 초기화

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        char[] c ={'A', 'P', 'P', 'L', 'E'};
        for (int i = 0; i < c.length; i++) {
            System.out.print((char)(c[i]+32));
        }


    }
}
