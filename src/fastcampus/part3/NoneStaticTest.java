package fastcampus.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //논-스태틱 접근 방법
        NoneStaticTest st = new NoneStaticTest();
        int sum = st.hap(a,b);
        System.out.println(sum);
    }

    public int hap(int a, int b){
        int v = a + b;
        return v;
    }
}
