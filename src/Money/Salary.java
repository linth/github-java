package Money;

public class Salary extends Income {

    public Salary(double income) {
        super(income);
    }
    
    @Override
    public double getTax() {
        // Polymorphic.
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}
