package fastcampus.part2;

public class _40_CallByReferenceExam {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int result = addArray(a);
        System.out.println(result);
    }

    public static int addArray(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}

