package example.EnumExample;

/**
 * Reference
 *  - https://beginnersbook.com/2014/09/java-enum-examples/
 */
enum Directions {
    EAST ("E"),
    WEST ("W"),
    NORTH ("N"),
    SOUTH ("S");

    private final String shortCode;

    Directions(String code) {
        this.shortCode = code;
    }

    public String getDirectionCode() {
        return this.shortCode;
    }
}

public class EnumBase {
    public static void main(String[] args) {
        printEnumAll();

        EnumBase eb = new EnumBase();
        eb.commonExample(Directions.EAST);
        eb.switchExample(Directions.SOUTH);
    }

    public void commonExample(Directions dir) {
        if (dir == Directions.EAST) {
            System.out.println("direction is east.");
        } else if (dir == Directions.WEST) {
            System.out.println("direction is west.");
        } else if (dir == Directions.NORTH) {
            System.out.println("direction is north.");
        } else if (dir == Directions.SOUTH) {
            System.out.println("direction is south.");
        }
    }

    public void switchExample(Directions dir) {
        switch (dir) {
            case EAST:
                System.out.println("direction is east.");
                break;
            case WEST:
                System.out.println("direction is west.");
                break;
            case NORTH:
                System.out.println("direction is north.");
                break;
            default:
                System.out.println("direction is south.");
                break;
        }
    }

    // how to iterate through an Enum variable?
    public static void printEnumAll() {
        for (Directions dir : Directions.values()) {
            System.out.println(dir);
        }
    }
}
