package designPattern.Builder.Vocation;

/**
 * Builder design pattern example.
 * 
 * Reference:
 *  - http://corrupt003-design-pattern.blogspot.com/2017/01/builder-pattern.html
 */
public class BuilderMain {
    
    public static void main(String[] args) {

        ThreeDayVocationBuilder threeDayVocationBuilder = new ThreeDayVocationBuilder();
        threeDayVocationBuilder.setBeginDate("2018/01/01")
            .setEndDate("2018/01/03")
            .setHotel(new Hotel())
            .setRestaurant(new Restaurant())
            .create();

        System.out.println(
            threeDayVocationBuilder.toString()
        );
    }
}
