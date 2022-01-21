package example.ClassExample;

/**
 * Super concept.
 * 
 * Reference:
 *  - https://www.tutorialspoint.com/java/java_inheritance.htm
 */
public class SuperConcept {
    public static void main(String[] args) {        
        ManObject man = new ManObject("george", 37, "boy");
        System.out.println("name: " + man.getName() + "; age: " + man.getAge() + "; sex: " + man.getSex());

        ManObject man2 = new ManObject();
        man2.setName("peter");
        man2.setAge(18);
        man2.setSex("boy");
        System.out.println("name: " + man2.getName() + "; age: " + man2.getAge() + "; sex: " + man2.getSex());

        HumanObject humanObject = new HumanObject("may", 22);
        humanObject.setId("1");
        System.out.println("(Human) name: " + humanObject.getName() + "; (Human) age: " + humanObject.getAge() + "; id: " + humanObject.getId());
    }
}

class HumanObject {
    //! 請注意繼承時，參數是否要被 subclass沿用。
    protected String name;
    protected int age;
    private String id;

    HumanObject() {

    }

    HumanObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void setName(String name) { this.name = name; }
    protected void setAge(int age) { this.age = age; }
    public void setId(String id) { this.id = id; }
    protected String getName() { return name; }
    protected int getAge() { return age; }
    public String getId() { return this.id; }

}

class ManObject extends HumanObject {
    private String sex;

    ManObject() {
        
    }

    ManObject(String name, int age, String sex) {
        super.name = name;
        super.age = age;
        this.sex = sex;
    }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }
}
