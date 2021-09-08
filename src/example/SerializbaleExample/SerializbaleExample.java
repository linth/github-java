package example.SerializbaleExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化/反序列化
 * 
 * 常使用的API
 *  - java.io.ObjectOutputStream
 *  - java.io.ObjectInputStream
 *  - java.io.Serializable
 *  - java.io.Externalizable
 * 
 * Reference
 *  - https://www.gushiciku.cn/pl/pi5K/zh-tw
 */
public class SerializbaleExample {
    public static void main(String[] args) {
        
    }

    public static void serializeProcess() {
        // TODO: need to check.
        // ObjectOutputStream objectOutputStream = new ObjectOutputStream( new FileOutputStream("D:\\text.out"));
        // Student student = new Student();
        // student.setAge(25);
        // student.setName("jayWei");
        // objectOutputStream.writeObject(student);

        // objectOutputStream.flush();
        // objectOutputStream.close();
    }

    public static void reserializeProcess() {
        // TODO: need to check.
        // FileInputStream fileInputStream = new FileInputStream("D:\\text.out");
        // ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        // Student student = (Student) objectInputStream.readObject();
        // System.out.println("name="+student.getName());
    }
}

class Student implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class SerializbaleExampleTest {
    public static void main(String[] args) {
        
    }
}