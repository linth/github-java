package example.DataTypeExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomData {
    
    public static void main(String[] args) {

        UUStudent uuStudent = new UUStudent();
        uuStudent.setName("george");
        Map<String, Object> map = new HashMap<>();
        map.put("id", "p001");
        uuStudent.setId(map);

        System.out.println("name: " + uuStudent.getName());
        System.out.println("name: " + uuStudent.getId().get("name"));

        Map<String, Object> map2 = new HashMap<>();
        map2.put("id", "p002");
        map2.put("name", "gg");
        map2.put("age", 22);
        
        map2.entrySet().forEach(s -> {
            System.out.println("S: " + s);
        });
    }

    public static void generateData() {
        Map<String, Object> rawMap = new HashMap<>();
        rawMap.put("E1 (Integer)", 1);
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        rawMap.put("E2 (IntArray)", l);
        rawMap.put("E3 (Instant)", "george");

        rawMap.forEach( (k, v) -> {
            System.out.println("k: " + k + "; v: " + v);
        });
    }

    public static PrivateAddress addData() {
        PrivateAddress privateAddress = new PrivateAddress();
        privateAddress.setParent("monther");

        Map<String, String> a = new HashMap<>();
        a.put("address1", "first address.");
        Map<String, Integer> a2 = new HashMap<>();
        a2.put("address1", 3);
        
        // privateAddress.setAddress(a);

        return privateAddress;
    }
}

class UUStudent {
    private String name;
    // private Integer age;
    // private Profile profile;
    Map<String, Object> id;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Map<String, Object> id) {
        this.id = id;
    }

    public Map<String, Object> getId() {
        return id;
    }
}


class Profile {
    private String phone;
    private Map<String, Object> score;
    private PrivateAddress privateAddress;

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhone() {
        return phone;
    }
}

class PrivateAddress {
    private String parent;
    private Map<String, Object> address;

    public void setParent(String parent) {
        this.parent = parent;
    }
    
    public String getParent() {
        return parent;
    }

    // public void setAddress(Map<String, String> a) {
    //     this.address = a;
    // }

    // public Map<String, ?> getAddress() {
    //     return address;
    // }
}
