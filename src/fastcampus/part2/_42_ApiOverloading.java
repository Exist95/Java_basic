package fastcampus.part2;

public class _42_ApiOverloading {
    public static void main(String[] args) {
        int max = maxValue(7,5);
        System.out.println(max);
        int min = minValue(4,2);
        System.out.println(min);
    }

    public static int maxValue(int a, int b){
        return (a > b) ? a : b;
    }

    public static int minValue(int a, int b){
        return (a < b) ? a : b;
    }
}
