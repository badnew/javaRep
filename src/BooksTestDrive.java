public class BooksTestDrive {
    public static void main(String[] args) {

        Books[] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Java Fruits";
        myBooks[1].title = "Java Getsby";
        myBooks[2].title = "Java collection";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Sew";
        myBooks[2].author = "Yan";

        int x = 0;
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", author ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
