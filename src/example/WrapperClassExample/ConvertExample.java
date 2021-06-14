package example.WrapperClassExample;

/**
 * 包裝類別
 * - Object
 *  - Boolean
 *  - Character
 *  - Number
 *      - Byte
 *      - Short
 *      - Integer
 *      - Long
 *      - Float
 *      - Double
 * 
 * 轉換方法
 * - valueOf()
 * - intValue(), byteValue(), doubleValue() 
 */
class ExampleValueOf {
    void do_convert() {
        Integer x = Integer.valueOf(10);
        Integer y = Integer.valueOf("101");
        Integer b2 = Integer.valueOf("10111", 2);
        Integer b8 = Integer.valueOf("15", 8);
        Integer b16 = Integer.valueOf("18a", 16);

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("b2: " + b2);
        System.out.println("b8: " + b8);
        System.out.println("b16: " + b16);
        System.out.println("Class of x: " + x.getClass());
    }
}

class ExampleConverToValue {
    /**
     * Number 有一個抽象類別 <type>Value() method.
     */
    //! 需要留意轉換時候的 overflow，如果資料大於轉換結果可容納範圍
    void do_convert() {
        Integer x = new Integer(1000);
        Double y = new Double(22.222);

        System.out.println("intValue(x): " + x.intValue());
        System.out.println("byteValue(x): " + x.byteValue());
        System.out.println("doubleValue(x): " + x.intValue());
        System.out.println("intValue(y): " + y.intValue());
        System.out.println("byteValue(y): " + y.byteValue());
        System.out.println("doubleValue(y): " + y.intValue());
    }
}

class ConstantWrapper {
    //! 除了Boolean，其他wrapper class有三個 contant 
    void do_show() {
        System.out.println("Max of Byte: " + Byte.MAX_VALUE);
        System.out.println("Min of Byte: " + Byte.MIN_VALUE);
        System.out.println("Size of Byte: " + Byte.SIZE);

        // Short, Integer, Long, Float, Double, Character
    }

    void do_show2() {
        // Float and Double 類別還有另外3個變數，NaN, NEGATIVE_INFINITY, POSITIVE_INFINITY.
        System.out.println("NaN of Float: " + Float.NaN);
        System.out.println("NEGATIVE_INFINITY of Float: " + Float.NEGATIVE_INFINITY);
        System.out.println("POSITIVE_INFINITY of Float: " + Float.POSITIVE_INFINITY);
    }
}

class Convert2String {
    final static Integer x = 32;
    Double y = 123.1111;
    
    void do_convert() {
        System.out.println("Convert2String x: " + x.toString());
        System.out.println("Convert2String y: " + y.toString());
    }
}

class String2ParseXXX {
    void do_parse() {
        //! 注意會有 overflow
        int i = Integer.parseInt("127");
        int i2 = Integer.parseInt("101", 2);
        int i8 = Integer.parseInt("101", 8); // "810", 8進制由0~7不可以有8
        int i16 = Integer.parseInt("101", 16); 
        double d = Double.parseDouble("100.0123");

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i8);
        System.out.println(i16);
        System.out.println(d);
    }
}

public class ConvertExample {
    public static void main(String[] args) {
        ExampleValueOf ev = new ExampleValueOf();
        ev.do_convert();

        ExampleConverToValue ecv = new ExampleConverToValue();
        ecv.do_convert();

        ConstantWrapper cw = new ConstantWrapper();
        cw.do_show();
        cw.do_show2();

        Convert2String c2s = new Convert2String();
        c2s.do_convert();

        String2ParseXXX s2p = new String2ParseXXX();
        s2p.do_parse();
    }
}

