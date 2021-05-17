package Money;

/**
 * Polymorphic 
 * 
 * Reference
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1260455778791232
 */

public class CalculateTotalTax {   

    public static void main(String[] args) {
        Income[] incomes = new Income[] {
            new Income(3000),
            new Salary(7500),
            new TWSpecialAllowance(15000),
        };
        System.out.println("total tax: " + totalTax(incomes));
    }

    public static double totalTax(Income... incomes) {
        double total = 0;

        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}
