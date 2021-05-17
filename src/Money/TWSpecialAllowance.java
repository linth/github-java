package Money;

public class TWSpecialAllowance extends Income {

    public TWSpecialAllowance(double income) {
        super(income);
    }
    
    @Override
    public double getTax() {
        // Polymorphic.
        return 0;
    }

}
