package fastcampus.part3;

import fastcampus.model.CarDTO;

public class CarUtilityTest {
    public static void main(String[] args) {
        int carSn = 1110;
        String carName = "BMW828i";
        int carPrice = 90000000;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType = "G";

        CarDTO car = new CarDTO();
        car.carSn = carSn;

        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }


}
