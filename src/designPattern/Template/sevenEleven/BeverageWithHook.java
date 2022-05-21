package designPattern.Template.sevenEleven;

public abstract class BeverageWithHook {
    // 我們可以使用新的 abstract class 來客製化一些掛勾功能

    public final void prepareRecipe() {

        // 煮開水
        boilWater();

        // 用沸水沖泡
        brew();

        // 把飲料倒進杯子
        pourInCup();

        if(customerWantsCondiments()) {
            // 加配料
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    private void boilWater() {
        // 不管是茶或咖啡做法都一樣，可以直接把實作寫在超類別。
        System.out.println("[BeverageWithHook] ");
    }

    private void pourInCup() {
        // 不管是茶或咖啡做法都一樣，可以直接把實作寫在超類別。
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}
