package designPattern.Builder.Vocation;

import java.util.Date;

/**
 * Builder design pattern.
 * 
 * 今天你要為一個遊樂園設計程式，讓客人可以自由選擇旅館及各種門票、餐廳訂位、
 * 或是其他特殊活動來建立自己的假期計畫，但你可能會遇到一些問題：
 * 每個客人的假期計畫都不一樣，如旅行天數不同，或是想住的旅館會不同，
 * 而且為了要滿足客製化假期內容的要求，你的設計可能會有很多建構子才能滿足需求。
 * 
 * Reference:
 *  - http://corrupt003-design-pattern.blogspot.com/2017/01/builder-pattern.html
 */
public class TranditionVocation {    
    
    public TranditionVocation(Date begin, Date end) {
        // 客人只要求天數，其他隨便排
        // ...
    }

    public TranditionVocation(Date begin, Date end, Hotel hotel) {
        // 客人要求天數，還指定飯店
        // ...
    }

    public TranditionVocation(Date begin, Date end, Hotel hotel, Restaurant restaurant) {
        // 客人指定天數，飯店，還有餐廳
        // ...
    }

    // 可能還有其他可以讓客人選擇的建構子
}

/**
 * Hotel
 */
class Hotel {

}

/**
 * Restaurant
 */
class Restaurant {

    
}