package LibraryApp;

public class Book {
    private String bookname;
    private String bookAuthor;
    private Boolean status;//available or rent



    public Book(String bookname, String bookAuthor) {
        this.bookname = bookname;
        this.bookAuthor = bookAuthor;
        this.status=true;

    }

    public String getBook() {
        return bookname;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void rent(){
        if(status){
            status=false;
            System.out.println(" " + bookname + "Kitab icareye goturuldu");
        } System.out.println(" " + bookname + "Kitab kitabxanada yoxdur" );

    }
    public void returnBook(){
        status =true;
            System.out.println(" " + bookname + "Kitab geri qaytarilib");
        }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", status=" + status +
                '}';
    }
}



