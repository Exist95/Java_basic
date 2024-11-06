package fastcampus.part4;

import fastcampus.model.*;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    private static void display(Animal ani) {
        ani.eat();

        if(ani instanceof Cat) {
            ((Cat)ani).night();
        }
    }


}
