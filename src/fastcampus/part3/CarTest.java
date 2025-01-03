package fastcampus.part3;

import fastcampus.model.CarDTO;
import fastcampus.model.CarDAO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 키보드로부터 입력 받아서 다른 메서드로 이동해야 되는 경우를 생각해보자.
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차 일련번호: ");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 이름: ");
        String carName = scan.nextLine();

        System.out.print("자동차 가격: ");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 소유자: ");
        String carOwner = scan.nextLine();

        System.out.print("자동차 년식: ");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 타입: ");
        String carType = scan.nextLine();

        scan.close();

        System.out.println(carSn + carName+ carOwner+ carYear+ carType+ carPrice);

        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
    }
}
