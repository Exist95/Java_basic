package fastcampus.part3;

import fastcampus.model.MovieVO;

public class BestVoModeling {
    public static void main(String[] args) {
        MovieVO vo = new MovieVO("아바타", 2022, "제이크", "액션", 120, 12);
        System.out.println(vo);
        System.out.println(vo.getLevel());
    }

}
