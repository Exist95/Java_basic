package fastcampus.part2;

public class _19_TwoDimArrayTest {
    public static void main(String[] args) {
        // Q. 2행 4열의 정수형 배열을 생성하세요.
        int[][] a = new int[2][4];

        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;
        a[0][3] = 40;
        a[1][0] = 50;
        a[1][1] = 60;
        a[1][2] = 70;
        a[1][3] = 80;

        System.out.println(a[0][0] +"\t" + a[0][1]);
        System.out.println(a[1][0] +"\t" + a[1][1]);
    }
}
