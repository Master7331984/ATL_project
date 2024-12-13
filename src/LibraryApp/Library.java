package LibraryApp;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> booksList;

public Library(){
    this.booksList= new ArrayList<>();
}


    public void addBooks(Book book){
    booksList.add(book);
        System.out.println("Kitabxanaya elave edildi");


    }
    public void showStatusBooks(){
        System.out.println("Movcud kitablar");
        for (Book book: booksList){
            if (book.getStatus()){
                System.out.println(book);
            }
        }
    }
    public void rentBook(String bookname){
    for (Book book : booksList){
        if (book.getBook().equalsIgnoreCase(bookname)){
            book.rent();
            return;
        }

    }
    }


}
