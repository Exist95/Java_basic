package fastcampus.part3;


import fastcampus.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = MyUtil.hap(a, b); // 클래스이름.호출메서드
        //글자 약간 기울어져있으면 static
        System.out.println(sum);
    }
}
