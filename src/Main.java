public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook("0001", "Effective Java", 450, "Joshua Bloch", "Java", "Spring Boot");
        books[1] = new ProgrammingBook("0002", "Clean Code", 1200, "Robert Martin", "Java", "Hibernate");
        books[2] = new ProgrammingBook("0003", "C++ Primer", 1000, "Stanley Lippman", "C++", "Qt");
        books[3] = new FictionBook("0004", "The Lord of the Rings", 1121, "J.R.R.Tolkien", "Fantasy");
        books[4] = new FictionBook("0005", "Harry Potter and the Sorcerer's Stone", 789, "J.K.Rowling", "Viễn tưởng 1");
        books[5] = new FictionBook("0006", "Dumb Luck", 345, "Vũ Trọng Phụng", "Literature");

        System.out.println("Total price of books: " + bookSum(books));
        countBooks(books);

    }

    public static double bookSum(Book[] books) {
        double sum = 0;
        for (Book book : books) {
            sum += book.getAmount();
        }
        return sum;
    }

    public static void countBooks(Book[] books) {
        int countJavaBook = 0;
        int countVientuongBook = 0;
        int countCheapFictionBook = 0;

        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals("Java")) {
                    countJavaBook++;
                }
            } else if (book instanceof FictionBook) {
                if (((FictionBook) book).getCategory().equals("Viễn tưởng 1")) {
                    countVientuongBook++;
                }
                if (book.getAmount() < 1000) {
                    countCheapFictionBook++;
                }
            }
        }

        System.out.println("Number of programming books written about Java:\n\t" + countJavaBook);
        System.out.println("Number of fiction books that have category 'Viễn tưởng 1':\n\t" + countVientuongBook);
        System.out.println("Number of fiction books that have price less than 1000:\n\t" + countCheapFictionBook);
    }
}