package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료 #1");
        
        hour = 10;
        boolean morningCoffee = false;
        //if(hour < 14 && morningCoffee == false){
        if(hour < 14 && !morningCoffee){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        hour = 10;
        boolean morningCoffee2 = true;
        //if(hour >= 14 || morningCoffee2 == true){
        if(hour >= 14 || morningCoffee2){
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
