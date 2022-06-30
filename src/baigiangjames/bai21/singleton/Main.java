package baigiangjames.bai21.singleton;

public class Main {
    public static void main(String[] args) {
        BookBorrow bookBorrow = new BookBorrow();
        BookBorrow bookBorrow1 = new BookBorrow();
        bookBorrow1.borrowBook("C0422H1");
        bookBorrow.borrowBook("Hello");

        System.out.println(bookBorrow.getAuthorAndTitle());
        bookBorrow1.returnBook();
        System.out.println(bookBorrow.getAuthorAndTitle());
        BookSingleton bookSingleton = BookSingleton.borrowBook("Hi");
        try {
            System.out.println(bookSingleton.getAuthorAndTitle());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
