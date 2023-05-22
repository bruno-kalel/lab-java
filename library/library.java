import java.util.ArrayList;
import java.util.List;

class Book
{
    private final String title;
    private final String author;
    private final String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public String getTitle() {return title;}
    public boolean isBorrowed() {return isBorrowed;}

    public void setBorrowed(boolean borrowed) {isBorrowed = borrowed;}

    @Override
    public String toString()
    {
        return "Book: "
                + "title: " + title
                + " | "
                + "author: " + author
                + " | "
                + "isbn: " + isbn
                + " | "
                + "isBorrowed: " + isBorrowed;
    }
}

class User
{
    private final String name;
    private final int id;
    private final List<Book> borrowedBooks;

    public User(String name, int id)
    {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {return name;}

    public void borrowBook(Book book)
    {
        if (!book.isBorrowed())
        {
            book.setBorrowed(true);
            borrowedBooks.add(book);
            System.out.println("success: book " + book.getTitle() + " borrowed!");
        }
        else
        {
            System.out.println("error: book " + book.getTitle() + " already borrowed");
        }
    }

    public void returnBook(Book book)
    {
        if (borrowedBooks.contains(book))
        {
            book.setBorrowed(false);
            borrowedBooks.remove(book);
            System.out.println("success: book " + book.getTitle() + " returned!");
        }
        else
        {
            System.out.println("error: book " + book.getTitle() + " not borrowed!");
        }
    }

    @Override
    public String toString()
    {
        return "User: "
                + "name: " + name
                + " | "
                + "id: " + id;
    }
}

record Borrowing(Book book, User user) {

    @Override
    public String toString() {
        return "BORROWING: " +
                book + " " + user;
    }
}

class Library
{
    private final List<Book> books;
    private final List<User> users;
    private final List<Borrowing> borrowings;

    public Library()
    {
        books = new ArrayList<>();
        users = new ArrayList<>();
        borrowings = new ArrayList<>();
    }

    public void addBook(Book book) {books.add(book);}
    public void addUser(User user) {users.add(user);}

    public void borrowBook(Book book, User user)
    {
        if (!book.isBorrowed())
        {
            Borrowing borrowing = new Borrowing(book, user);
            borrowings.add(borrowing);
            user.borrowBook(book);
        }
        else
        {
            System.out.println("error: book " + book.getTitle() + " already borrowed");
        }
    }

    public void returnBook(Book book, User user)
    {
        if (book.isBorrowed())
        {
            Borrowing borrowing = findBorrowing(book, user);
            if (borrowing != null)
            {
                borrowings.remove(borrowing);
                user.returnBook(book);
            }
            else
            {
                System.out.println("error: book " + book.getTitle() + " not borrowed!");

            }
        }
    }

    private Borrowing findBorrowing(Book book, User user)
    {
        for (Borrowing borrowing : borrowings)
        {
            if (borrowing.book() == book && borrowing.user() == user)
            {
                return borrowing;
            }
        }
        return null;
    }

    public void listBooks()
    {
        System.out.println("all books: ");
        for (Book book : books)
        {
            System.out.println(book);
        }
    }

    public void listUsers()
    {
        System.out.println("all users: ");
        for (User user : users)
        {
            System.out.println(user);
        }
    }

    public void listBorrowings()
    {
        System.out.println("all borrowings: ");
        for (Borrowing borrowing : borrowings)
        {
            System.out.println(borrowing);
        }
    }
}

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