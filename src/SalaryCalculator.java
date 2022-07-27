public class SalaryCalculator {

    public double multiplierPerDaysSkipped(int daysSkipped){
        return daysSkipped <= 5 ? 1.0 : 0.85;
    }

    public int multiplierForProductSold(int productsSold){
        int multiplier = productsSold <= 20 ? 10 : 13;
        return multiplier;
    }

    public int bonusForProductSold(int productSold){
        return multiplierForProductSold(productSold)*productSold;
    }

    public double finalSalary(int daysSkipped, int productSold){
        int baseSalary = 1000;
        double finalSalary = (baseSalary * multiplierPerDaysSkipped(daysSkipped)) + bonusForProductSold(productSold);
        double finalSalaryCapped = finalSalary <= 2000 ? finalSalary : 2000;
        return finalSalaryCapped;
    }
}
