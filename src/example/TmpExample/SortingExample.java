package example.TmpExample;

/**
 * Sorting 功能範例
 *  - 用 Collections 實作 (ArrayList, HashSet, TreeSet, ..., etc.)
 *  - 用 Comparable 實作
 *  - 用 Comparator 實作
 * 
 * Comparator:
 *  - when we want to sort instances of a class which cannot be modified. e.g, an instance of a class from a jar.
 *  - required to sort by different fields based on use cases.e.g, One use case wants to sort by "name" other wants by "no" or some other case wants by both "name and no".
 * 
 * Comparable:
 *  - should be used when we know the order of sorting while defining the class and there won't be any other cases where we would require the Collection/array to sort by some other field(s).
 * 
 * Reference:
 *  - https://dzone.com/articles/how-to-sort-objects-in-java
 *  - https://ithelp.ithome.com.tw/articles/10229625
 */
public class SortingExample {
    public static void main(String[] args) {
        
    }
}
