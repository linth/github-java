package game.concrete;

/**
 * 繼承是 -is, 組合是 has 關係
 * Reference
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1260454548196032
 */
import game.abs.Book;

public class ChineseBook extends Book {
    
    public ChineseBook() {
        // constructor.
    }

    public ChineseBook(String n, String p) {
        this.name = n;
        this.publishVendorCountry = p;
    }
}
