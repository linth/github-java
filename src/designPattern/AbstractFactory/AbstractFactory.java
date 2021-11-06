package designPattern.AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {

    }
}

/**
 * Example: GUI Factory.
 * 
 * Reference 
 *  - https://refactoringguru.cn/design-patterns/abstract-factory/java/example
 *  - https://nwpie.blogspot.com/2017/05/3-class-interface-abstract.html
 */
interface Button {
    void paint();
}

class MacOSButton implements Button {
    // Mac 按鈕
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}

class WindowsButton implements Button {
    // Windows 按鈕
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}

interface Checkbox {
    void paint();
}

class MacOSCheckbox implements Checkbox {
    // Mac 核取方塊
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}

class WindowsCheckbox implements Checkbox {
    // Windows 核取方塊
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}

interface GUIFactory {
    Button createButton();

    Checkbox createChkecbox();
}

class MacOSFactory implements GUIFactory {
    // Mac GUI介面
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createChkecbox() {
        return new MacOSCheckbox();
    }
}

class WindowsFactory implements GUIFactory {
    // Windows GUI介面
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createChkecbox() {
        return new WindowsCheckbox();
    }
}