package fastcampus.part4;

public class Employee extends Object {
    protected String name;
    protected int age;
    protected String phone;
    protected String empDate;
    protected String dept;
    protected boolean marriage;
    // protected 는 같은 패키지 안에 있어야만 자식에서 사용 가능

    public Employee(){
        super(); // 상위클래스의 생성자를 호출 -> new Object()
        // [super]도 생략 가능
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
