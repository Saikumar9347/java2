class TaxCalculator {
    public static void main(String[] args) {
        // Given data
        double salary = 85000;
        double taxRate = 20; // 20%

        // Calculate tax amount
        double taxAmount = (taxRate / 100) * salary;

        // Display total tax paid
        System.out.println("Mr. Vikram's salary: ₹" + salary);
        System.out.println("Tax rate: " + taxRate + "%");
        System.out.println("Total tax paid: ₹" + taxAmount);
    }
}
