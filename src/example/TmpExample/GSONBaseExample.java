package example.TmpExample;

/**
 * GSON 可能要移轉到 spring boot 專案上
 * 
 * 
 * Reference:
 *  - https://blog.tonycube.com/2012/03/gsonjavajson.html
 *  - https://github.com/google/gson/blob/master/UserGuide.md
 */
public class GSONBaseExample {
    public static void main(String[] args) {
        object2Json();
    }

    public static void object2Json() {
        Book book = new Book("956-987236-1", "Java歷險記", 550);
        System.out.println(book.toString());
    }

    public static void json2Object() {
        
    }
}

class Book {
    private String name;
    private String isbn;
    private int price;

    Book(String name, String isbn, int price) {
        this.name = name;
        this.isbn = isbn;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}