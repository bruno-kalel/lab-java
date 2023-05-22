public class Main
{
    public static void main(String[] args)
    {
        Library library = new Library();

        User u1 = new User("name1", 1);
        User u2 = new User("name2", 2);

        Book b1 = new Book("title1", "author1", "isbn1");
        Book b2 = new Book("title2", "author2", "isbn2");

        library.addUser(u1);
        library.addUser(u2);

        library.addBook(b1);
        library.addBook(b2);

        library.borrowBook(b1, u1);
        library.borrowBook(b2, u1);

        library.borrowBook(b1, u2);
        library.borrowBook(b2, u2);

        library.returnBook(b1, u1);
        library.returnBook(b2, u1);

        library.borrowBook(b1, u2);
        library.borrowBook(b2, u2);

        library.listUsers();
        library.listBooks();
        library.listBorrowings();
    }
}