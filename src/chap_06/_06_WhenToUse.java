package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number, int exponant){
        int result = 1;
        for (int i = 0; i < exponant ; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(getPower(2,2));
        System.out.println(getPower(3,3));
        System.out.println(getPower(4,2));
        
//        int result = 1;
//        for (int i = 0; i < 2; i++) {
//            result *= 2;
//        }
//        System.out.println(result);
//
//        result = 1;
//        for (int i = 0; i < 3; i++) {
//            result *= 3;
//        }
//        System.out.println(result);
//
//        result = 1;
//        for (int i = 0; i < 2; i++) {
//            result *= 4;
//        }
//        System.out.println(result);
    }
}