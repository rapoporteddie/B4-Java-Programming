package day07_relational_operators;

public class Salary_Calculator {
    public static void main(String[] args) {

        double salary = 100_000.00;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTaxAmount, federalTaxAmount, totalTaxAmount, salaryAfterTax;
        stateTaxAmount = salary * stateTaxRate;
        federalTaxAmount = salary * federalTaxRate;
        totalTaxAmount = stateTaxAmount +federalTaxAmount;
        salaryAfterTax = salary - totalTaxAmount;

        String taxReport = "Tax Info: \n\tBase Salary: $" + salary + "\n\tState Tax Rate: " + stateTaxRate;

        System.out.println(taxReport);




    }


}
