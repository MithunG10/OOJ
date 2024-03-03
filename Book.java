import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books() {};
    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        String name, author, price, numPages;
        name = "Book Name : " + this.name + "\n";
        author = "Author Name : " + this.author + "\n";
        price = "Price : " + this.price + "\n";
        numPages = "Number of Pages : " + this.numPages + "\n";

        return name + author + price + numPages;
    } 
}


class BRun{
    public static void main(String[] args) {
        System.out.println("Name : Mithun G");
		System.out.println("USN : 1BM22CS096");
        Scanner sc = new Scanner(System.in);
        int n;
        String name, author;
        int price, numPages;

        System.out.println("Enter the number of books: ");
        n = sc.nextInt();

        Books b[];
        b = new Books[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Books " + (i + 1) + ": ");
            System.out.print("Enter name of the book: ");
            name = sc.next();
            System.out.print("Enter Author: ");
            author = sc.next();
            System.out.print("Enter price: ");
            price = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter number of pages: ");
            numPages = sc.nextInt();
            sc.nextLine();
            b[i] = new Books(name, author, price, numPages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Book: " + (i + 1) + "\n" + b[i]);
        }
    }
}
