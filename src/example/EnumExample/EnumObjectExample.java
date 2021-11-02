package example.EnumExample;

public class EnumObjectExample {
    public static void main(String[] args) {
        // TODO: add an example.
    }
}

class Drone2 {
    private String deviceName;

    private String deviceMode;
    
    private DroneStatus droneStatus;

    public void setDeviceName(String deviceName) { this.deviceName = deviceName; }
    public void setDeviceMode(String deviceMode) { this.deviceMode = deviceMode; }

    // public void setDroneStatus() {}
}

class DroneStatus {
    public enum connectStatus {
        ON,
        OFF,
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
