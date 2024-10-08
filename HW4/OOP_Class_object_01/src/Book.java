
public class Book {
	// Class variables
    String title;
    String author;

    // Custom Constructor
    Book(String bookTitle, String bookAuthor) {
        // Set values based on parameters
        title = bookTitle;
        author = bookAuthor;
    }

    // Class method
    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object of the class Book (custom constructor is called)
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Call a method to display information
        myBook.displayInfo();
	}

}
