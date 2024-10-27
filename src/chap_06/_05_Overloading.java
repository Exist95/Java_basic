package chap_06;

public class _05_Overloading {

    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    public  static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public  static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    //이름은 같지만 파라미터 타입이 다른 메소드를 알아서 호출한다

    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("3"));
        System.out.println(getPower(3,3));
    }
}
