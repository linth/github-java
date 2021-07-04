package example.ClassExample;

public class MultipleInheritanceInterfaceExample {
    public static void main(String[] args) {
        
    }
}


interface B {
    default void BMethod() {
        System.out.println("This is a B interface class.");
    }

    void BmethodOne();
}

interface C {
    default void CMethod() {
        System.out.println("This is a C interface class.");
    }

    void CmethodOne();
}

/**
 * 注意多重繼承時，method 名稱不能重複，會有衝突發生。
 */
class A implements B, C {

    public void BmethodOne() {
        // implement BmethodOne.
    }

    public void CmethodOne() {
        // implement CmethodOne.
    }
}