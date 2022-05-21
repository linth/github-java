package designPattern.Template.sevenEleven;

/**
 * 統一的泡咖啡 SOP
 * 
 * Reference:
 *  - http://corrupt003-design-pattern.blogspot.com/2016/07/template-method-pattern.html
 */
public class Coffee extends Beverage {
    
    @Override
    public void brew() {
        System.out.println("[Coffee] 用沸水沖泡");
    }

    @Override
    public void addCondiments() {
        System.out.println("[Coffee] 加糖和牛奶");
    }
}
