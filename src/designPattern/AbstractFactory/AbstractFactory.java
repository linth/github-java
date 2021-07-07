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
 */
interface Button {
    void paint();
}

class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}

interface Checkbox {
    void paint();
}

class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}

class WindowsCheckbox implements Checkbox {
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
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createChkecbox() {
        return new WindowsCheckbox();
    }
}