package fastcampus.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
       Person p = new Person();
       p.name = "홍길동";
       p.age = 1000;
       p.phone = "010-1234-1234";
        System.out.println(p.name);
    }
}