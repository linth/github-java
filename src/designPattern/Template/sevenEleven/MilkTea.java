package designPattern.Template.sevenEleven;

public class MilkTea extends BeverageWithHook {
    
    public void brew() {
        System.out.println("[MilkTea] 用沸水沖泡");
    }

    public void addCondiments() {
        System.out.println("[MilkTea] 加珍珠、糖");
    }
}
