package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setBookName("Head First With Java");
        book1.setBookColor("Blue");
        book1.setBookPage(700);

        book2.setBookName("DSA");
        book2.setBookColor("Green");
        book2.setBookPage(5500);

        System.out.println(book1.getBookName());
        System.out.println(book1.getBookColor());
        System.out.println(book1.getBookPage());
    }
}
