public class Book {
    private static int bookCount = 0;
    private String bookCode;
    private String name;
    private double price;
    private String author;

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author) {
        bookCount++;
        this.bookCode = "000" + bookCount;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public double getAmount() {
        System.out.println("You will get a discount!");
        return this.price;
    }
}
