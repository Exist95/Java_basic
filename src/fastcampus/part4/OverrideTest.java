package fastcampus.part4;

import fastcampus.model.Animal;
import fastcampus.model.Cat;
import fastcampus.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        //업케스팅 : 타인이 자바 파일을 주지 않고, 클래스 파일만 줬을 때 사용 가능
        Animal a = new Dog();
        a.eat();  //Animal -> (동적바인딩) -> Dog

        a = new Cat();
        a.eat();
    }
}
