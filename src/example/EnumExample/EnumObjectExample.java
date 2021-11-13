package example.EnumExample;

/**
 * 把 enum 和 object class 結合的範例
 *  - 可利用 enum 來記錄 每個 class object 狀態，透過 enum 可以條列出選項選擇。
 */
public class EnumObjectExample {
    public static void main(String[] args) {
        Drone2 drone2 = new Drone2();

        drone2.setDeviceName("George's drone");
        drone2.setConnectStatus(DroneStatus.connectStatus.ON);
        drone2.setTaskStatus(DroneStatus.taskStatus.OFF);
        // drone2.setConnectStatus2(DroneStatus2.connectStatus.ON);

        System.out.println(drone2);
        System.out.println(drone2.getDeviceName());
        System.out.println(drone2.getConnectStatus());
        System.out.println(drone2.getTaskStatus());
        // System.out.println(drone2.getConnectStatus2());
    }
}

class Drone2 {
    private String deviceName; // drone's name.

    private String deviceMode; // device's mode.
    
    private DroneStatus.connectStatus connectStatus; // drone's connection status.

    private DroneStatus.taskStatus taskStatus; // drone's task status.

    // private DroneStatus2.connectStatus connectStatus2; // 使用 enum + object + shortCode 方式


    public void setDeviceName(String deviceName) { this.deviceName = deviceName; }
    public void setDeviceMode(String deviceMode) { this.deviceMode = deviceMode; }
    public void setConnectStatus(DroneStatus.connectStatus connectStatus) { this.connectStatus = connectStatus; }
    public void setTaskStatus(DroneStatus.taskStatus taskStatus) { this.taskStatus = taskStatus; }
    // public void setConnectStatus2(DroneStatus2.connectStatus connectStatus2) { this.connectStatus2 = connectStatus2; }

    public String getDeviceName() {
        return deviceName;
    }

    public String getDeviceMode() {
        return deviceMode;
    }

    public DroneStatus.connectStatus getConnectStatus() {
        return connectStatus;
    }

    public DroneStatus.taskStatus getTaskStatus() {
        return taskStatus;
    }

    // public DroneStatus2.connectStatus getConnectStatus2() {
    //     return connectStatus2;
    // }
}

/**
 * 一般 enum + object 範例
 * 
 */
class DroneStatus {
    public enum connectStatus {
        ON (1),
        OFF (0);

        private final int shortCode;

        connectStatus(int code) {
            this.shortCode = code;
        }

        public int getShortCode() {
            return shortCode;
        }
    }

    public enum taskStatus {
        ON,
        OFF,
    }

    public enum isMediaStreaming {
        ON,
        OFF,
    }

    public enum isMqttIotHub {
        ON,
        OFF,
    }
} 

/**
 * 結合 enum + object + shortcode 方式範例
 * 
 * TODO: enum + object + shortcode
 */
class DroneStatus2 {
    public enum connectStatus {
        ON (1),
        OFF (0);

        private final int shortCode;

        connectStatus(int code) {
            this.shortCode = code;
        }
    }
}