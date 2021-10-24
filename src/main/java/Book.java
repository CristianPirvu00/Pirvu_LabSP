import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;

    private List<Author> authors = new ArrayList<>();


    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }


//    public String print(){
//    }
}


class Chapter{
    private String name;

    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }
}

class SubChapter {
    private String Name;

    private List<Paragraph> paragraphs = new ArrayList<>();

    public SubChapter(String name) {
        Name = name;
    }
}

class Paragraph{
    private String text;
}
