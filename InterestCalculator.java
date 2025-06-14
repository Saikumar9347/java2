class InterestCalculator {
    public static void main(String[] args) {
        // Given data
        double principal = 500000;
        double rate = 6.8; // 6.8%
        int time = 5; // years

        // Calculate interest
        double interest = (principal * rate * time) / 100;

        // Calculate final amount
        double finalAmount = principal + interest;

        // Display results
        System.out.println("Principal Amount: ₹" + principal);
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Total Interest: ₹" + interest);
        System.out.println("Final Amount after " + time + " years: ₹" + finalAmount);
    }
}