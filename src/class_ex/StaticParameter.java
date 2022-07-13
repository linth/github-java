package class_ex;

/**
 * static 關鍵字
 *  - public static => 可視為全局變數、全局方法
 *  - 使用 static parameter, method 時候，不可以使用 this 關鍵字
 *  - 不需要實體化即可直接存取，非靜態成員需要先被new建立一個實體 (物件) 才可以訪問
 */

public class StaticParameter {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "George";
        s1.age = 20;

        s2.name = "Mary";
        s2.age = 33;

        s1.output();
        s2.output();

        KKStudent k1 = new KKStudent();
        KKStudent k2 = new KKStudent();

        k1.name = "kk1";
        k2.name = "kk2";
        KKStudent.age = 24; // k1.age = 24; // bad style. 

        k1.output();
        k2.output();
    }
}


class Student {
    final static int max_age = 120;
    public int age;
    public String name;

    public void output() {
        System.out.println("Name: " + name + "; Age: " + age);
    }

    boolean is_outOfMaxage() {
        //! 使用 static parameter, method 時候，不可以使用 this 關鍵字
        if (this.age > max_age) {
            return true;
        }
        return false;
    }
}

class KKStudent {
    public static int age; //! 跟Student差別在於 static 
    public String name;

    KKStudent() {

    }

    KKStudent(String name) {
        this.name = name;
    }

    public void output() {
        System.out.println("Name: " + name + "; Age: " + age);
    }
}

class Team {
    public static String team;
    public static String name;

    static {
        team = "GoGo team";
        name = "EX-man";
    }
}