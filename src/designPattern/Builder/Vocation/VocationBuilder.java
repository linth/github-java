package designPattern.Builder.Vocation;

import java.util.List;

public interface VocationBuilder {
    
    // set up 假期開始時間
    public VocationBuilder setBeginDate(String date);

    // set up 假期結束時間
    public VocationBuilder setEndDate(String date);

    // set up 哪間飯店
    public VocationBuilder setHotel(Hotel hotel);

    // set up 餐廳
    public VocationBuilder setRestaurant(Restaurant restaurant);

    // set up 景點的門票
    public VocationBuilder setTicket(List tickets);

    // 要提供一個方法讓使用者能取得假期物件
    public VocationBuilder create();
}
