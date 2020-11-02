public class Test {

    public static void main(String[] args) {
        System.out.println("BEGIN TEST");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book");
        System.out.println("BookBorrower1 Author and Title");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower2.borrowBook();


        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the took");

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 asked to borrow the book");
        System.out.println("BookBorrower2 Author and Title");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        BookBorrower bookBorrower3 = new BookBorrower();
        bookBorrower3.borrowBook();
        System.out.println("BookBorrower3 asked to borrow the book");
        System.out.println("BookBorrower3 Author and Title");
        System.out.println(bookBorrower3.getAuthorAndTitle());
    }
}
