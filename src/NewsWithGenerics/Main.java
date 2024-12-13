package NewsWithGenerics;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //News addNews = new News();

        ArrayList<News> news = new ArrayList<>();
        News xeber1 = new News("Futbol dahileri", new Category("İdman"),new Author("Ferhad","Hasanli"), LocalDate.of(2024,12,12));
news.add(xeber1);
        xeber1.displayInfo();
    }
}
