class PizzaBill{
    public static void main(String[] args) {
        // Given data
        double pizzaPrice = 399;
        int quantity = 2;
        double discountRate = 20; // 20%

        // Calculate total cost
        double totalCost = pizzaPrice * quantity;

        // Calculate discount
        double discountAmount = (discountRate / 100) * totalCost;

        // Calculate final bill
        double finalBill = totalCost - discountAmount;

        // Display results
        System.out.println("Total bill before discount: ₹" + totalCost);
        System.out.println("Discount amount (20%): ₹" + discountAmount);
        System.out.println("Final bill after discount: ₹" + finalBill);
    }
}
