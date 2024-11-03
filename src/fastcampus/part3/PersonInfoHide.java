package fastcampus.part3;

import fastcampus.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // 한 사람의 회원 정보를 저장할 객체를 생성하시오.
        PersonVO vo = new PersonVO();
        vo.name = "홍";
        vo.age = 1;
        vo.phone = "2";

        System.out.println(vo.name + vo.age + vo.phone);
    }
}
