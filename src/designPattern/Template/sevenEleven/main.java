package designPattern.Template.sevenEleven;

public class main {
    public static void main(String[] args) {

        // 製作咖啡
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        // 製作茶
        Tea tea = new Tea();
        tea.prepareRecipe();

        // 製作奶茶
        MilkTea milkTea = new MilkTea();
        milkTea.prepareRecipe();
    }
}
