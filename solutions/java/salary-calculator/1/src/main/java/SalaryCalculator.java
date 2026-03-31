public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double result = (daysSkipped < 5) ? 1.0 : 0.85;
        return result;
       // Bedingung ? WertWennTrue : WertWennFalse;
    }

    public int bonusMultiplier(int productsSold) {
        int result = (productsSold >= 20) ? 13 : 10;
        return result;
    }

    public double bonusForProductsSold(int productsSold) {
        double result = (productsSold >= 20) ? productsSold * 13 : productsSold * 10;
        return result;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (daysSkipped < 5) ? 1000 * 1.0 + bonusForProductsSold(productsSold) : 1000 * 0.85 + bonusForProductsSold(productsSold);
        salary = (salary > 2000) ? 2000 : salary;
        return salary;
        // min = 1000, max = 2000
    } 
}
