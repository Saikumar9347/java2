class salarycalculator {
    public static void main(String[] args) {
        double basicSalary = 8500;

        // Updated percentages
        double taPercent = 15;
        double daPercent = 20;
        double hraPercent = 18;

        // Deductions
        double pfPercent = 20;
        double taxPercent = 25;

        // Calculate allowances
        double ta = (taPercent / 100) * basicSalary;
        double da = (daPercent / 100) * basicSalary;
        double hra = (hraPercent / 100) * basicSalary;

        // Gross salary
        double grossSalary = basicSalary + ta + da + hra;

        // Deductions
        double pf = (pfPercent / 100) * basicSalary;
        double tax = (taxPercent / 100) * basicSalary;
        double totalDeductions = pf + tax;

        // Net salary
        double netSalary = grossSalary - totalDeductions;

        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Total Deductions: ₹" + totalDeductions);
        System.out.println("Net Salary: ₹" + netSalary);
    }
}