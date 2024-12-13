package NewsWithGenerics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class News<T, U extends Category, Z extends Author> {
    private T newsTitle;
    private U newsCategory;
    private Z newsAuthor;
    private LocalDate newsDate;

    public News(T newsTitle, U newsCategory, Z newsAuthor, LocalDate newsDate) {
        this.newsTitle = newsTitle;
        this.newsCategory = newsCategory;
        this.newsAuthor = newsAuthor;
        this.newsDate = newsDate;
    }

    public T getNewsTitle() {
        return newsTitle;
    }

    public U getNewsCategory() {
        return newsCategory;
    }

    public Z getNewsAuthor() {
        return newsAuthor;
    }

    public LocalDate getNewsDate() {
        return newsDate;
    }
    public String getFormatter(){
        return newsDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public void displayInfo(){
        System.out.println("Xeberin bashligi " + newsTitle);
        System.out.println("Xeberin kateqoriyasi " + newsCategory.getName());
        System.out.println("Xeberin muellifi " + newsAuthor.fullName());
        System.out.println("Xeberin cap olunma tarixi " + getFormatter());

    }


}
