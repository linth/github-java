package game.abs;

public abstract class Book {
    protected String name;
    protected String publishVendorCountry;

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }
}
