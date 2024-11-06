package fastcampus.part4;

import fastcampus.model.Animal;
import fastcampus.model.Cat;
import fastcampus.model.Dog;

// 다형성, 업캐스팅
public class PolyTest {
    public static void main(String[] args) {
        // Upcasting으로 객체를 생성
        // 상속관계, 재정의(Override), 동적바인딩
        // message polymorphism
        // 상위클래스가 동일한 메세지로 하위클래스를 서로 다르게 동작시키는 객체지향 원리
        Animal ani = new Dog();
        ani.eat(); // 실행시점에서 사용될 메서드가 결정되는 바인딩

        ani = new Cat();
        ani.eat();


    }
}
