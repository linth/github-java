package class_ex;


/**
 * Encapsulation example.
 */
public class Bank {
    public static void main(String[] args) {
        TaipeiBank tb = new TaipeiBank("Peter");
        KaohsiungBank kb = new KaohsiungBank("George");

        tb.get_balance();
        // tb.balance = 1000; // error.
        tb.get_balance();

        kb.get_balance();
        kb.balance = 10000;
        kb.get_balance();
    }
}


class TaipeiBank {
    private String name;
    private int balance;

    TaipeiBank(String name) {
        this.name = name;
        this.balance = 0;
    }

    void get_balance() {
        System.out.println(this.name + ": the balance: " + this.balance);
    }
}

class KaohsiungBank {
    //! 請注意比較 TaipeiBank 的 private 方式。
    String name;
    int balance;

    KaohsiungBank(String name) {
        this.name = name;
        this.balance = 0;
    }

    void get_balance() {
        System.out.println(this.name + ": the balance: " + this.balance);
    }
}