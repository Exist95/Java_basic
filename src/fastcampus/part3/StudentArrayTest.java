package fastcampus.part3;

import fastcampus.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        Student[] std = new Student[4];
        std[0] = new Student("홍", "컴공", 34, "qwe@naver.com", 20231010, "010-");
        std[1] = new Student("김", "화학", 31, "qwe@naver.com", 20231010, "010-");
        std[2] = new Student("나", "수학", 32, "qwe@naver.com", 20231010, "010-");
        std[3] = new Student("다", "건축", 33, "qwe@naver.com", 20231010, "010-");

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].toString());
        }

        for (Student st  : std ) {
            System.out.println(st.toString());
         }
    }
}
