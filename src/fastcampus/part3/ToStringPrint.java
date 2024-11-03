package fastcampus.part3;

import fastcampus.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("g",1,"010-");
        System.out.println(vo.toString());
    }
}
