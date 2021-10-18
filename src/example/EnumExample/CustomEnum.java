package example.EnumExample;

import example.EnumExample.Drone.CurrentStatus;
import example.EnumExample.Drone.SwitchStatus;
import example.EnumExample.Pizza.PizzaStatus;

/**
 * Class + Enum 範例
 * 
 * TODO: 繼續擴充學習觀念並結合！
 * 
 * Reference:
 *  - https://github.com/linth/JavaGuide/blob/master/docs/java/basic/%E7%94%A8%E5%A5%BDJava%E4%B8%AD%E7%9A%84%E6%9E%9A%E4%B8%BE%E7%9C%9F%E7%9A%84%E6%B2%A1%E6%9C%89%E9%82%A3%E4%B9%88%E7%AE%80%E5%8D%95.md
 */
public class CustomEnum {
    public static void main(String[] args) {
        // pizza example.
        Pizza pizza = new Pizza();
        pizza.setStatus(PizzaStatus.ORDERED);

        if (pizza.getStatus().equals(Pizza.PizzaStatus.ORDERED)) {
            System.out.println("ORDERED");
        } else if (pizza.getStatus().equals(Pizza.PizzaStatus.READY)) {
            System.out.println("READY");
        } else {
            System.out.println("DELIVERED");
        }

        // drone example.
        Drone drone = new Drone();
        drone.setSwitchStatus(SwitchStatus.ON)
            .setCurrentStatus(CurrentStatus.IotHub)
            .setIsMediaStreaming(true)
            .setIsIotHub(true)
            .setIsAiMediaStreaming(false);
        System.out.println("CurrentStatus: " + drone.getCurrentStatus());
        System.out.println("IsMediaStreaming: " + drone.getIsMediaStreaming());
        System.out.println("IsIotHub: " + drone.getIsIotHub());
        System.out.println("IsAiMediaStreaming: " + drone.getIsAiMediaStreaming());
    }
}

class Pizza {
    private PizzaStatus status;

    public enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED;
    }

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    public boolean isDeliverable() {
        if (getStatus() ==  PizzaStatus.READY) {
            return true;
        }
        return false;
    }
}

class Drone {
    // ! class + enum example.
    private SwitchStatus switchStatus;
    private CurrentStatus currentStatus;
    private boolean IsMediaStreaming = false;
    private boolean IsIotHub = false;
    private boolean IsAiMediaStreaming = false;

    public enum SwitchStatus {
        ON,
        OFF;
    }

    public enum CurrentStatus {
        MediaStreaming,
        IotHub,
        AiMediaStreaming;
    }

    public SwitchStatus getSwitchStatus() {
        return switchStatus;
    }

    public Drone setSwitchStatus(SwitchStatus switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    public CurrentStatus getCurrentStatus() {
        return currentStatus;
    }

    public Drone setCurrentStatus(CurrentStatus currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }

    public boolean getIsMediaStreaming() {
        return IsMediaStreaming;
    }

    public Drone setIsMediaStreaming(boolean IsMediaStreaming) {
        this.IsMediaStreaming = IsMediaStreaming;
        return this;
    }

    public boolean getIsIotHub() {
        return IsIotHub;
    }

    public Drone setIsIotHub(boolean IsIotHub) {
        this.IsIotHub = IsIotHub;
        return this;
    }

    public boolean getIsAiMediaStreaming() {
        return IsAiMediaStreaming;
    }

    public Drone setIsAiMediaStreaming(boolean IsAiMediaStreaming) {
        this.IsAiMediaStreaming = IsAiMediaStreaming;
        return this;
    }
}
