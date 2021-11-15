package example.ClassExample;

/**
 *  三層架構：interface class, abstract class, concrete class.
 * 
 * ! interface/abstract class 皆不能實體化
 * 
 */
public class ThreeTierExample {
    public static void main(String[] args) {
        ConcreteConvert cc = new ConcreteConvert("george", 178, 75);
        double res = cc.calBMI();
        System.out.println(res);

        ConverterA ca = new ConverterA("mary", 166, 49);
        double res2 = ca.calBMI();
        System.out.println(res2);
    }
}

interface Orgin {
    /**
     * 1. interface class 不能實體化
     * !2. 介面變數必須要有初始值
     * 3. interface class 可多重繼承 interface class.
     */
    // String sex = "";
}

interface InterfaceConvert extends Orgin {
    public double calBMI();
}

abstract class AbstractConvert implements InterfaceConvert {
    /**
     * 1. abstract class 算是部分可以定義或實作的class。
     * !2. abstract class 也不能實體化
     * 3. abstract class 也不可以多重繼承
     */
    public String name;
    public double height;
    public double weight;

    AbstractConvert(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public double calBMI() {
        return weight / Math.pow(height * 0.01, 2);
    }
}

class ConcreteConvert extends AbstractConvert {
    ConcreteConvert(String name, double height, double weight) {
        super(name, height, weight);
    }
}

class ConverterA extends AbstractConvert {
    ConverterA(String n, double h, double w) {
        super(n, h, w);
    }

    @Override
    public double calBMI() {
        return weight + height;
    }
}