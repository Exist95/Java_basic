package fastcampus.part3;

import fastcampus.model.Myutil1;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Myutil1 my = new Myutil1();
        int sum = my.hap(a,b); // static 아니기 때문에 hap 폰트가 기울어지지 않음
        System.out.println(sum);
    }
}
