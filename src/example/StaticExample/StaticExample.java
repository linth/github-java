package example.StaticExample;

// import example.StaticExample.Person;

public class StaticExample {
    public static void main(String[] args) {
        Person ming = new Person("George", 30);

        Person hong = new Person("May", 22);

        ming.number = 88;
        System.out.println("ming number: " + ming.number + "; hong num: " + hong.number);

        hong.number = 99;
        System.out.println("ming number: " + ming.number + "; hong num: " + hong.number);

        ming.setNumber(100);
        System.out.println("ming number: " + ming.number + "; hong num: " + hong.number);        

        System.out.println("Male: " + ming.MALE + "; Female: " + ming.FEMALE);
    }
}
