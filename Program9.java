public class Program9 {
    public static void main(String[] arg){
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        developerInfo();

        SavingsAccount.modifyInterestRate(4.0);

        // Display savings balance for a whole year
        printSaver1();
        displayYearlySavings(saver1);
        printSaver2();
        displayYearlySavings(saver2);

        // Depositing to saver1
        printSaver1();
        saver1.displayDeposit(1500);

        // Withdrawing from saver2
        printSaver2();
        saver2.displayWithdraw(550);

        // Change interest rate to 5%
        SavingsAccount.modifyInterestRate(5);

        // Calculating monthly interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        printSaver1();
        displayNextMonthSavings(saver1);
        printSaver2();
        displayNextMonthSavings(saver2);

    }

    // Static methods to print test objects

    public static void printSaver1()
    {
        System.out.println("\nSaver 1:");
    }

    public static void printSaver2()
    {
        System.out.println("\nSaver 2:");
    }

    public static void displayYearlySavings(SavingsAccount saver)
    {
        String[] year ={"January","February","March","April","May","June","July","August","September","October","November","December"};
        for (String month : year){
            saver.calculateMonthlyInterest();
            System.out.printf("%-15s%15s", month, saver);
        }
    }

    public static void displayNextMonthSavings(SavingsAccount saver)
    {
        System.out.printf("%s: %4s", "Next month's savings balance", saver);
    }


    //***************************************************************
    //
    //  Method:       developerInfo
    //
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void developerInfo()
    {
        System.out.println("Name:    Khue Nguyen");
        System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: Nine \n");

    } // End of developerInfo

}
