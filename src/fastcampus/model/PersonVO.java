package fastcampus.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    public PersonVO() {
        // 객체를 생성하는 코드는 내부에서 만들어진다.
        // 객체의 초기화를 한다.
        this.name = "홍";
        this.age=1;
        this.phone="010-";
    }
    // 생성자의 오버로딩
    public PersonVO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // setter method
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    // getter method
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getPhone(){
        return this.phone;
    }

    public String toString(){
        return name + "\t" + age + "\t" + phone;
    }
}
