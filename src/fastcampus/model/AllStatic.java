package fastcampus.model;

public class AllStatic {

    //new 생성자로 못불러 오게 막는 키워드 private
    private AllStatic(){

    }
    public static int hap(int a, int b){
        int v = a + b;
        return v;
    }

    public static int max(int a, int b){
        return a > b ? a : b;
    }

    public static int min(int a ,int b){
        return a < b ? a : b;
    }
}
