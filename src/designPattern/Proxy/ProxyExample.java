package designPattern.Proxy;

import java.util.HashMap;

/**
 * Proxy 範例
 * 
 * Reference:
 *  - https://refactoringguru.cn/design-patterns/proxy
 */
public class ProxyExample {
    
}

interface ThirdPartyTVLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}

class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video";
    }
}