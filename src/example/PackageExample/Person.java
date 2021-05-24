package example.PackageExample;


/**
 * Package name.
 * 
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1260467032946976
 */

import example.StaticExample.Human;

public class Person {
    private int age;
    public String name;
    protected String sex;


    private int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    protected String getSex() {
        return this.sex;
    }
}
