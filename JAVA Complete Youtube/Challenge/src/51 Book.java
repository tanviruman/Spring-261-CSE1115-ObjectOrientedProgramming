/*Create a Book class for a library system.
• Instance variables: title, author, isbn.
• Static variable: totalBooks, a counter for the total number of book
instances.
• Instance methods: borrowBook(), returnBook().
• Static method: getTotalBooks(), to get the total number of books in the
library.*/


class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
         totalBooks = 0;

    }

    {
        totalBooks++;
    }

    static int gettotalBooks(){

        return totalBooks;
    }

    Book(String title,String author,String isbn ){

        this.title= title;
        this.author = author;
        this.isbn = isbn;

    }

    Book(String isbn){
        this("unknown","Unknown",isbn);
    }

    void borrowBook(){

        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }

    }

    void returnBook(){

        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        } else {
            System.out.println("This book is already in the library");
        }

    }

    public static void main(String[] args) {
        Book designOfThings = new Book("MEW MEW", "Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.gettotalBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }


}
