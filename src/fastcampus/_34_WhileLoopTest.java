package fastcampus;

public class _34_WhileLoopTest {
    public static void main(String[] args) {
        int i = 0;
        while (i<=5) {
            System.out.println(i);
            i++;
        }

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        i = 0;
        while(i < numbers.length){
            System.out.println(numbers[i]);
            i++;
        }
    }
}
