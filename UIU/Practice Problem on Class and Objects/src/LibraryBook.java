 class LibraryBook {
    String title;
    String author;
    boolean isAvailable;

    LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // available by default
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Basics", "James Gosling");
        book.borrowBook();
        book.borrowBook(); // try borrowing again
        book.returnBook();
        book.borrowBook(); // available again
    }
}