record Borrowing(Book book, User user) {

    @Override
    public String toString() {
        return "BORROWING: " +
                book + " " + user;
    }
}