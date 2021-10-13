package example.SerializbaleExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化/反序列化基礎
 * 
 * 序列化：把 object 轉成 byte 過程 (方便傳輸)
 * 反序列化：把 byte 恢復成 object 過程
 * 
 * References:
 *  - https://www.jyt0532.com/2017/09/29/implement-serializable-judiciously/
 *  - https://matthung0807.blogspot.com/2019/01/java-serializedeserialize.html
 *  - https://www.gushiciku.cn/pl/pi5K/zh-tw
 */
public class SerializableBase {
    public static void main(String[] args) {
        Employee2 employee = new Employee2();
        employee.name = "George";
        employee.email = "george@gmail.com";

        // 把物件寫到檔案中
        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("src/example/SerializbaleExample/employee"))) {
            objOut.writeObject(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 把檔案中讀出物件
        try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(new File("src/example/SerializbaleExample/employee")))) {
            Employee2 emp = (Employee2) objIn.readObject();
            System.out.println("employee's name: " + emp.name + "; email: " + emp.email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Employee {
    public String name;
    public String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

/**
 * implements Serializable 對於後續傳遞資料、可存進disk裡面，需要再把它讀出來。
 */
class Employee2 implements Serializable {
    public String name;
    public String email;

    // ! 有實現序列化的class會自動生成一個serialVersionUUID 這個變數
    static final long serialVersionUUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}