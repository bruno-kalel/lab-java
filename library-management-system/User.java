import java.util.ArrayList;
import java.util.List;

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
        return "USER: "
                + "name: " + name
                + " | "
                + "id: " + id;
    }
}