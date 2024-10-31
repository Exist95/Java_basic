package fastcampus;

public class _07_Casting {
    // 형 변환 (Casting)이란? 값의 타입을 다른 타입으로 변환하는 것
    // 자동형변환(묵시적) : 작은 type이 큰 type에 저장되는 경우 (byte -> int)
    // 강제형변환(명시적) : 큰 type이 작은 type에 저장되는 경우 (int -> byte, 손실발생)
    // 사용 방법 : (DataType)변수;

    public static void main(String[] args) {
        int a = 5;
        double b = a;
        System.out.println(b);

        float f1 = .10f; //0.10
        float f2 = 15f; //15.0
        float f3 = 3.14f; //3.14
        double d1 = 123.4567; //123.4567

        //크기는 같지만 소수점 때문에 계산 되지 않음
        float x = 15.6f;
        int y = (int)x;
        System.out.println(y); //15 => 0.6 손실

        //자동형변환
        char c = 'A';
        int cc = (int)c;
        System.out.println(cc);  //65

        //double 8byte, int 4byte
        int d = 5;
        double dd = d;
        System.out.println(dd); //5.0 실수형 자료로 출력

        double dx = 14.67;
        int dy = (int)dx;
        System.out.println(dy); //14 손실발생
    }






}
