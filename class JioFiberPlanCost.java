class JioFiberPlanCost {
    public static void main(String[] args) {
        // Initial plan cost
        double planCost = 699;

        // GST percentage
        double gstRate = 18;

        // Calculate GST amount
        double gstAmount = (gstRate / 100) * planCost;

        // Calculate final plan cost
        double finalCost = planCost + gstAmount;

        // Display results
        System.out.println("Jio Fiber Silver Plan Cost: ₹" + planCost);
        System.out.println("GST (18%): ₹" + gstAmount);
        System.out.println("Final Plan Cost (including GST): ₹" + finalCost);
    }
}