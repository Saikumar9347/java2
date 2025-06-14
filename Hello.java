class Hello 
{
    public static void main(String[] args) {
        
        int num1,num2,num3,num4,temp;
        //swap two numbers with temp//
        num1=7;
        num2=12;
        System.out.println("Before swapping numbers.. "+num1+"  "+num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping two numbers with temps.. "+num1+"  "+num2);
        
        // Swap back to original to show without temp
        num1=7;
        num2=12;
        System.out.println("Before swapping numbers.. "+num1+"  "+num2);

        // Swap without temporary variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping without temp variable: " + num1 + "  " + num2);
        
       // Swap three numbers with temp variable//
        num1=7;
        num2=12;
        num3=20;
        System.out.println("Before swapping three numbers... " + num1 + "  " + num2 + "  " + num3);
        temp = num1;
        num1 = num2;
        num2 = num3;
        num3 = temp;
        System.out.println("After swapping three numbers with temp.. " + num1 + "  " + num2 + "  " + num3);

        // Swap three numbers without temp variable
        // First, reset to original
        num1 = 7;
        num2 = 12;
        num3 = 20;
        System.out.println("Before swapping three numbers .." + num1 + "  " + num2 + "  " + num3);
        num1 = num1 + num2 + num3;
        num2 = num1 - (num2 + num3); // original num1
        num3 = num1 - (num2 + num3); // original num2
        num1 = num1 - (num2 + num3); // original num3
        System.out.println("After swapping three numbers without temp: " + num1 + "  " + num2 + "  " + num3);
        // swap four numbers with using temp//
        num1 = 7;
        num2 = 12;
        num3 = 20;
        num4=45;
        System.out.println("Before swapping four numbers.. "+num1+"  "+num2+"  "+num3+"  "+num4);
        temp = num1;
        num1 = num2;
        num2 = num3;
        num3 = num4;
        num4 = temp;
        System.out.println("After swapping four  numbers with temp.. "+num1+"  "+num2+"  "+num3+"  "+num4);
        // swap four numbers with out using temp//
        num1 = 7;
        num2 = 12;
        num3 = 20;
        num4=45;

        System.out.println("Before swapping four numbers.. "+num1+"  "+num2+"  "+num3+"  "+num4);

        num1 = num1 + num2 + num3 + num4;
        num2 = num1 - (num2 + num3 + num4);
        num3 = num1 - (num2 + num3 + num4);
        num4 = num1 - (num2 + num3 + num4);
        num1 = num1 - (num2 + num3 + num4);
        System.out.println("After swapping four numbers without temp variable.. "+num1+"  "+num2+"  "+num3+"  "+num4);


    }
}

