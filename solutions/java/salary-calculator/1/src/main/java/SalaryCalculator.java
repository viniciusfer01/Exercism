public class SalaryCalculator {
    double BASE_SALARY = 1000.00;
    double MAX_SALARY = 2000.00;
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (BASE_SALARY + bonusForProductsSold(productsSold)) * salaryMultiplier(daysSkipped);
        return salary > MAX_SALARY ? MAX_SALARY : salary;
    } 
}
