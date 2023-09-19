
import java.util.ArrayList;

public class Library {
    // Add the missing implementation to this class

    String address;
    ArrayList<Book> books = new ArrayList<>();
    int position = 0;


    public Library(String name){
        address = name;
    }

    void addBook(Book b){
        books.add(b);
        position += 1;
    }

    public static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress(){
        System.out.println(address);
    }

    public void borrowBook(String title){
        boolean borrow = false;
        for (Book book : books){
            if(book.getTitle().equals(title)){
                if(book.isBorrowed() == false){
                    book.rented();
                    borrow = true;
                    System.out.println("You successfully borrowed The Lord of the Rings");
                    break;
                }
                else{
                    //borrow = false;
                    System.out.println("Sorry, this book is already borrowed.");
                    break;
                }   
            } 
        }
        if (borrow == true){
            System.out.println("Sorry, this book is not in our catalog.");
        }   
        
    }

    public void printAvailableBooks(){
        for (Book book: books){
            if(book.isBorrowed() == false){
                System.out.println(book.getTitle());
            }
        }
    }


    public void returnBook(String name){
        for(Book book : books){
            if(book.getTitle().equals(name)){
                book.returned();
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 
