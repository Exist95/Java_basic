package fastcampus.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        // 일반사원 한명의 객체를 생성하고 데이터를 저장 후 출력하세요.

        RempVO vo = new RempVO();
        vo.name = "홍";
        vo.age = 1;
        vo.phone = "010-";
        vo.empDate = "2022";
        vo.dept = "홍보";
        vo.marriage = true;

        System.out.println(vo.toString());
    }
}
