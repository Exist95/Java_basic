package fastcampus.part4;

import fastcampus.model.Animal;
import fastcampus.model.Cat;
import fastcampus.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Dog d = new Dog();

        // 업케스팅 -> 부모가 자식을 가리킨다.
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
