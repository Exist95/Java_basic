package fastcampus.part3;

import fastcampus.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 50;
        arr[3] = 70;
        arr[4] = 60;
        arr[5] = 40;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        Student vo = new Student("홍", "컴공", 37, "qwe@naver.com", 20231010, "010-");
        System.out.println(vo.toString());
    }
}
