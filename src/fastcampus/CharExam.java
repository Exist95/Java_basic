package fastcampus;

public class CharExam {
    public static int getNum(char num) {
        return Character.getNumericValue(num);
    }

    public static void main(String[] args) {
        //Q. '1'+'2'+'3'+'4'+'5' = 15가 나오도록 프로그래밍 하시오.
        int a = getNum('1');
        int b = getNum('2');
        int c = getNum('3');
        int d = getNum('4');
        int e = getNum('5');
        System.out.println(a+b+c+d+e);
    }
}
