package example.GenericExample;

/**
 * Reference
 *  - http://puremonkey2010.blogspot.com/2010/12/gossip-in-java-generics.html
 */
public class InterfaceAndGenericExample {
    public static void main(String[] args) {
        GenericHuman<String, String, Integer> genericHuman = new GenericHuman<>();
        genericHuman.setId("F001");
        genericHuman.setName("George");
        genericHuman.setAge(44);
        System.out.println("ID: " + genericHuman.getId() + "; Name: " + genericHuman.getName() + "; Age: " + genericHuman.getAge());

        Student<Integer, String, Integer, String> student = new Student<>();
        student.setId(1);
        student.setName("Peter");
        student.setAge(19);
        student.setEmail("Peter@gmail.com");
        System.out.println("ID: " + student.getId() + "; Name: " + student.getName() + "; Age: " + student.getAge() + "; Email: " + student.getEmail());
    }
}

interface Human<T1, T2, T3> {
    public void setId(T1 id);
    public void setName(T2 name);
    public void setAge(T3 age);

    public T1 getId();
    public T2 getName();
    public T3 getAge();
}

class GenericHuman<T1, T2, T3> implements Human<T1, T2, T3> {
    protected T1 id;
    protected T2 name;
    protected T3 age;

    public void setId(T1 id) {
        this.id = id;
    }

    public void setName(T2 name) {
        this.name = name;
    }

    public void setAge(T3 age) {
        this.age = age;
    }

    public T1 getId() {
        return id;
    }

    public T2 getName() {
        return name;
    }

    public T3 getAge() {
        return age;
    }
}

class Student<T1, T2, T3, T4> extends GenericHuman<T1, T2, T3> {
    protected T4 email;

    public void setEmail(T4 email) {
        this.email = email;
    }

    public T4 getEmail() {
        return email;
    }
}

