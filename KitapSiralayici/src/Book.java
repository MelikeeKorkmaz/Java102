import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;

public class Book implements Comparable<Book> {
    private String name;
    private int pageNum;
    private String author;
    private int publishYear;

    Book(String name, int pageNum, String author, int publishYear) {
        this.name = name;
        this.pageNum = pageNum;
        this.author = author;
        this.publishYear = publishYear;
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\t\t" +
                "Number of Pages: " + pageNum + "\t\t" +
                "Author: " + author + "\t\t" +
                "Publish Year: " + publishYear;
    }

    public static void main(String[] args) {

        TreeSet<Book> str = new TreeSet<>();
        str.add(new Book("Nutuk", 543, "Mustafa Kemal Atatürk", 1927));
        str.add(new Book("Araba Sevdası", 272, "Recaizade Mahmud Ekrem", 1897));
        str.add(new Book("Küçük Prens", 112, "Antoine de Saint-Exupéry", 1943));
        str.add(new Book("Hayvan Çiftliği", 152, "George Orwell", 1945));
        str.add(new Book("Suç ve Ceza", 687, "Fyodor Dostoyevski", 1866));

        System.out.println("İsim Sırasıyla Kitap Listesi:");
        Iterator<Book> byStr = str.iterator();
        while (byStr.hasNext()) {
            System.out.println(byStr.next().toString());
        }

        System.out.println("________________");

        TreeSet<Book> num = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum() - o2.getPageNum();
            }
        });

        num.addAll(str);

        System.out.println("Sayfa Numarası Sırasıyla Kitap Listesi:");
        Iterator<Book> byNum = num.iterator();
        while (byNum.hasNext()) {
            System.out.println(byNum.next().toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}