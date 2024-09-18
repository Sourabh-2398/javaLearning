package OOPS;

public class Instructor {
    public long id;
    public String name;
    public String title;
    public String department;
    public Book[] books;

    // Constructor chaining using 'this' keyword
    public Instructor(long id, String name, String title, String department, Book[] books) {
        this(id, name, title, department);
        this.books = books;
    }

    public Instructor(long id, String name, String title, String department) {
        this(id, name, title);
        this.department = department;
    }

    public Instructor(long id, String name, String title) {
        this(id, name);
        this.title = title;
    }

    public Instructor(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Get the title of the most recent book
    public String getMostRecentBookTitle() {
        if (books != null && books.length > 0) {
            return books[books.length - 1].title;
        }
        return "No books available";
    }

    // Update book title at a specific index and return the old Book
    public Book updateBook(int index, String title) {
        if (index >= 0 && index < books.length) {
            Book oldBook = books[index];
            books[index] = new Book(title);
            return oldBook;
        }
        return null;  // Return null if index is invalid
    }

    // Update the entire book at a specific index and return the old Book
    public Book updateBook(int index, Book book) {
        if (index >= 0 && index < books.length) {
            Book oldBook = books[index];
            books[index] = book;
            return oldBook;
        }
        return null;  // Return null if index is invalid
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java for Beginners");
        Book book2 = new Book("Scala for Beginners");
        Book book3 = new Book("Effective Python");

        Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science", new Book[]{book1, book2, book3});
        System.out.println(instructor.getMostRecentBookTitle()); // Output: Effective Python

        System.out.println("Old book title: " + instructor.updateBook(1, "Effective C#").title);  // Output: Scala for Beginners

        Book book4 = new Book("Introduction to Data Mining");
        System.out.println("Old book title: " + instructor.updateBook(1, book4).title);  // Output: Effective C#
        System.out.println(instructor.books[1].title);
    }

  
}

