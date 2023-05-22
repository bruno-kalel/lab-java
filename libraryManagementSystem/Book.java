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
        return "BOOK: "
                + "title: " + title
                + " | "
                + "author: " + author
                + " | "
                + "isbn: " + isbn
                + " | "
                + "isBorrowed: " + isBorrowed;
    }
}