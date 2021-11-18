package example.TmpExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Comparator & Comparable 範例
 *  - Comparable: 可比較的，通常用在物件implements使用。
 *  - Comparator: 比較器，應用範圍廣，此介面提供很多默認方法供lamda expression使用
 * 
 * ! 常被運用在排序上使用，可利用 Comparator 去為物件的屬性重新排序 (如: id, name, phone number, ..., etc)
 * 
 * Reference:
 *  - https://dotblogs.com.tw/duke/2019/12/13/151221
 *  - https://ithelp.ithome.com.tw/articles/10229868
 *  - https://ithelp.ithome.com.tw/articles/10229625
 *  - https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
 */
public class ComparatorExample<T> {
    public static void main(String[] args) {
        sort();
    }

    public static List<Employee> generateData() {
        // generate data.
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "George", 88888));
        employees.add(new Employee(2, "May", 22222));
        employees.add(new Employee(4, "Peter", 77777));
        employees.add(new Employee(5, "Pany", 22256));
        employees.add(new Employee(3, "John", 136241));
        employees.add(new Employee(6, "HaHa", 112789));
        return employees;
    }

    public static List<Employee> generateData2() {
        // generate data.
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "George", 5133513));
        employees.add(new Employee(2, "May", 154623));
        employees.add(new Employee(4, "Peter", 214696));
        employees.add(new Employee(5, "Pany", 37763546));
        employees.add(new Employee(3, "John", 642425));
        employees.add(new Employee(6, "HaHa", 262464688));
        return employees;
    }

    public static void sort() {
        // * sorting function.

        // generate a series of employee.
        List<Employee> employees = generateData();
        
        sortingByName(employees); // sorting by name.
        sortingBySalary(employees); // sorting by salary.
    }

    public static void sortingByName(List<Employee> employees) {
        Comparator<Employee> employeeNameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };

        // sorting by name.
        Collections.sort(employees, employeeNameComparator);
        System.out.println("===sorting by name===");
        employees.forEach(s -> {
            System.out.println("id: " + s.getId() + "; name: " + s.getName() + "; salary: " + s.getSalary());
        });
    }

    public static void sortingBySalary(List<Employee> employees) {
        Comparator<Employee> employeeSalayComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() < e2.getSalary()) {
                    return -1;
                } else if (e1.getSalary() > e2.getSalary()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        // sorting by salary.
        Collections.sort(employees, employeeSalayComparator);
        System.out.println("===sorting by salary===");
        employees.forEach(s -> {
            System.out.println("id: " + s.getId() + "; name: " + s.getName() + "; salary: " + s.getSalary());
        });
    }

    // TODO: how to use generic function and implement it.
    // public void sortingByYouWant(List<T> t) {
    //     // TODO: think about using generic class/function to implement it.
    //     Comparator<T> tComparator = new Comparator<T>() {
    //         @Override
    //         public int compare(T t1, T t2) {
    //             // TODO: not sure how to implement it.
    //             return t1.getName().compareTo(t2.getName());
    //         }
    //     };
    // }
}

class SortByName implements Comparator<Employee> {
    // * compare Employee by name.

    // TODO: add anther condition.
    // https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
    public int compare(Employee e1, Employee e2) {
        // ! return int ??
        return e1.getName().compareTo(e2.getName());
    }
}

/**
 * Employee's class structure.
 */
class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    Employee() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}