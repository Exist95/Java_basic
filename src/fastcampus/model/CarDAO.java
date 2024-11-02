package fastcampus.model;

public class CarDAO {
    //CRUD
    public void carInsert(CarDTO car){
        System.out.println("car 정보가 DB에 저장이 되었습니다.");

    }
    public void carUpdate(CarDTO car){
        System.out.println("car 정보가 업데이트 되었습니다.");
    }
}
