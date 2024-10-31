package fastcampus;

public class _10_BookExam {
    public static void main(String[] args) {
        // Q. 정수 1개를 저장할 [변수를 선언]하시오.
        int a;
        a = 10;
        // Q. 책 1권을 저장할 변수를 선언하시오.
        //_09_Book b;
        //b = new _09_Book();

        // Q. 한 권의 책 데이터를 저장하기 위해서 객체를 생성하시오. (인스턴스를 만드시오)

       _09_Book b = new _09_Book();
        b.title = "자바";
        b.price = 30000;
        b.company = "패스트캠퍼스";
        b.author = "작가";
        b.page = 700;
        b.ISBN = "ISBN-123456";
        System.out.println(b.title);
    }
}
