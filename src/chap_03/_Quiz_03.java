package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String idNum = "901231-1234567";

        System.out.println(idNum.substring(0,8));
        System.out.println(idNum.substring(0,idNum.indexOf("-")+2));
    }
}
