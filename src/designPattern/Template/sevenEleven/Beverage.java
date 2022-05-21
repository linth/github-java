package designPattern.Template.sevenEleven;

public abstract class Beverage {
    
    // 宣告為 final 是因為不想次類別，推翻這個方法，這是統一的演算法。
    public final void prepareRecipe() {
        
        // 煮開水
        boilWater();

        // 用沸水沖泡
        brew();

        // 把飲料倒進杯子
        pourInCup();

        // 加配料
        addCondiments();
    }

    // 因為咖啡跟茶處理這些方法的做法不同，所以宣告為抽象方法，留給次類別去處理。
    abstract void brew();
    abstract void addCondiments();

    private void boilWater() {
        // 不管是茶或咖啡做法都一樣，可以直接把實作寫在超類別。
        System.out.println("[Beverage] 煮開水");
    }

    private void pourInCup() {
        // 不管是茶或咖啡做法都一樣，可以直接把實作寫在超類別。
        System.out.println("[Beverage] 把飲料倒進杯子");
    }
}
