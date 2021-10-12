package example.EnumExample;

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
        Pizza pizza = new Pizza();
        pizza.setStatus(PizzaStatus.ORDERED);

        if (pizza.getStatus().equals(Pizza.PizzaStatus.ORDERED)) {
            System.out.println("ORDERED");
        } else if (pizza.getStatus().equals(Pizza.PizzaStatus.READY)) {
            System.out.println("READY");
        } else {
            System.out.println("DELIVERED");
        }
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
