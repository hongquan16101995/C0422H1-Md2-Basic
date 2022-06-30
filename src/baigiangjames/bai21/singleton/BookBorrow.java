package baigiangjames.bai21.singleton;

public class BookBorrow {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook(String author) {
        borrowedBook = BookSingleton.borrowBook(author);
        haveBook = borrowedBook != null;
    }

    public String getAuthorAndTitle() {
        if (haveBook) {
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }

    public void returnBook() {
        haveBook = false;
        borrowedBook.returnBook();
    }
}
