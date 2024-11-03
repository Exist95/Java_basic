package fastcampus.part3;

import fastcampus.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        PersonVO vo1 = new PersonVO("노",1,"123-");
        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
        System.out.println(vo1.getName() + "\t" + vo1.getAge() + "\t" + vo1.getPhone());
    }
}
