import java.util.ArrayList;
import java.util.List;

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