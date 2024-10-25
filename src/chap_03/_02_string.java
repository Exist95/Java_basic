package chap_03;

public class _02_string {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and", ",")); // and를 ,로 변환
        System.out.println(s.substring(7)); // 7부터 시작 (이전 내용 삭제)
        System.out.println(s.substring(s.indexOf("Java")));
        // Java 가 시작되는 위치부터, .이 시작하는 위치 바로 앞까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf('.'))); // 시작 위치부터 끝 위치 "직전"


        // 공백 제거
        s = "     I love Java.         ";
        System.out.println(s);
        System.out.println(s.trim());


        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
