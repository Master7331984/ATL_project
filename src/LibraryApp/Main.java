package LibraryApp;

public class Main {
    public static void main(String[] args) {
        //Kitabxana yaradilir
        Library library = new Library();

//Kitablar yaradilir
Book book1 = new Book("Java Programming", "James Programming");
Book book2 = new Book("Clean Code", "Robert Martin");
Book book3 = new Book("The pragmatic Programmer", "Andrew Hunt");

//Kitablar kitabxanaya elave edilir
        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);
//Movcud kitablarin siyahisi gosterilir
 library.showStatusBooks();
 //Kitab icareye goturulur
        library.rentBook("Clean Code");
        library.showStatusBooks();
 //Artiq icarede olan kitabi yeniden icareye goturmek
        library.rentBook("Clean Code");
  //Kitabi geri qaytaririq
  library.rentBook("Clean Code");
  library.showStatusBooks();
    }
}
