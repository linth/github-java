package example.EnumExample;

/**
 * Basic enum example.
 * 
 * TODO: 多讀一些open source code進來揣摩別人寫法
 * 
 * Reference
 *  - https://beginnersbook.com/2014/09/java-enum-examples/
 *  - https://github.com/linth/JavaGuide/blob/master/docs/java/basic/%E7%94%A8%E5%A5%BDJava%E4%B8%AD%E7%9A%84%E6%9E%9A%E4%B8%BE%E7%9C%9F%E7%9A%84%E6%B2%A1%E6%9C%89%E9%82%A3%E4%B9%88%E7%AE%80%E5%8D%95.md
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

    public static void printAllEnum() {
        // provide to print all enum data in Enum class.
        for (Directions dir : Directions.values()) {
            System.out.println(dir);
        }
    }
}

public class EnumBase {
    public static void main(String[] args) {
        // printEnumAll(); // using outside function to show all enum item.
        Directions.printAllEnum();   // using function in the enum class.

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

    /**
     * how to iterate through an Enum variable?
     * 1) 在enum建立foreach function 顯示
     * 2) 在外部建立新的function 顯示
     */
    public static void printEnumAll() {
        for (Directions dir : Directions.values()) {
            System.out.println(dir);
        }
    }
}
