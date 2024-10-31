package fastcampus;

public class _14_ArrayMake {
    public static void main(String[] args) {
        // Q. 정수 5개를 저장 할 [배열을 생성]하시오.
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = 10;
            System.out.println(a[i]);
        }

        float[] f = new float[5]; //길이가 고정, 수정하기 까다롭다

        _09_Book b1, b2, b3;
        _09_Book[] b = new _09_Book[3];
    }
}
