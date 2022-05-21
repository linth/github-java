package designPattern.Template.sevenEleven;

/**
 * 統一的泡茶 SOP
 * 
 * Reference:
 *  - http://corrupt003-design-pattern.blogspot.com/2016/07/template-method-pattern.html
 */
public class Tea extends Beverage {
    
    @Override
    public void brew() {
        System.out.println("[Tea] 煮開水");
    }

    @Override
    public void addCondiments() {
        System.out.println("[Tea] 加檸檬");
    }
}
