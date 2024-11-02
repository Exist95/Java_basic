package fastcampus.part3;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한 사람의 데이터를 저장할 변수를 선언하세요.
        Person p = new Person(); //생성자 메서드 (Constructor)
        p.name = "홍길동";
        p.age = 30;
        p.phone = "010-1234-1234";
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);
        p.play();
        p.eat();
        p.walk();
    }
}
