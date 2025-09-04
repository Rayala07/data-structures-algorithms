class Book {
    String name;
    int pages;
    double price;

    public Book(String name, int pages, double price) {
        this.name = name;
        this.pages = pages;
        this.price = price;
    }
}

public class Practice_2 {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java Basics", 300, 450.0),
                new Book("Python Guide", 200, 500.0),
                new Book("C++ Handbook", 300, 550.0),
                new Book("Algorithms", 150, 600.0)

        };

        System.out.println("Current order: ");
        for(Book b: books) {
            System.out.println(b.name + " " + b.pages + " " + b.price);
        }

        insertionSort(books);

        System.out.println();

        System.out.println("Updated Order: ");
        for(Book b: books) {
            System.out.println(b.name + " " + b.pages + " " + b.price);
        }
    }

    public static void insertionSort(Book[] books) {
        if(books.length <= 1) return;
        insertionSortHelper(books);
    }

    public static void insertionSortHelper(Book[] books) {
        int size = books.length;

        for(int i=0; i<size; i++) {
            int j = i;
            while( j > 0 && (books[j - 1].pages > books[j].pages ||
                    (books[j - 1].pages == books[j].pages && books[j - 1].price < books[j].price))) {
                Book temp = books[j - 1];
                books[j - 1] = books[j];
                books[j] = temp;
                j--;
            }
        }
    }
}
