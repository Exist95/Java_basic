package fastcampus.part3;

import fastcampus.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // 한 사람의 회원 정보를 저장할 객체를 생성하시오.
        PersonVO vo = new PersonVO();
        vo.setName("홍");
        vo.setAge(123);
        vo.setPhone("010-");
        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
    }
}
