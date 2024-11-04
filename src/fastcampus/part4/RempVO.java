package fastcampus.part4;

// 일반사원(VO)
public class RempVO extends Employee {

    public RempVO(){
        super();
    }

    // 초기화
    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage){
        super(name,age,phone,empDate,dept,marriage);
    }
}
