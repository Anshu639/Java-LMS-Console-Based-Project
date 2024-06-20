public class Main {
    public static void main(String[] args) {
        DBManager dbManager = new DBManager();

        dbManager.addBook("1984", "George Orwell", 8.99f);
        dbManager.addBook("To Kill a Mockingbird", "Harper Lee", 7.99f);

        System.out.println("Listing all books:");
        dbManager.getBooks();

        dbManager.updateBook(1, "1984", "George Orwell", 9.99f);

        System.out.println("Updated listing of books:");
        dbManager.getBooks();

        dbManager.deleteBook(2);

        System.out.println("Final listing of books:");
        dbManager.getBooks();

        dbManager.close();
    }
}
