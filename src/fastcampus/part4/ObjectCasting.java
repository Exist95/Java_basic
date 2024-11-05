package fastcampus.part4;

import fastcampus.model.Animal;
import fastcampus.model.Cat;
import fastcampus.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal --> Dog, Cat;
        // Upcasting;
         Animal ani = new Dog();
         ani.eat();

         ani = new Cat();
         ani.eat();
         //downCasting
         Cat c = (Cat)ani;
         c.night();
         // ((Cat)ani).night();


    }
}
