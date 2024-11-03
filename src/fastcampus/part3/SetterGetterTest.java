package fastcampus.part3;

import fastcampus.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();

        vo.setName("홍");
        vo.setAge(123);
        vo.setPhone("010-");
        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());

    }
}
