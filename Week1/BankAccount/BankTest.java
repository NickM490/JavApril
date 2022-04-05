public class BankTest {
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount();

        acc1.transaction("deposit", "checking", 500);

        acc1.transaction("deposit", "savings", 500);
        acc1.transaction("withdrawal", "checking", 150);
        acc1.transaction("withdrawal", "savings", 175);
        acc1.transaction("withdrawal", "checking", 351);
        acc1.transaction("withdrawal", "savings", 326);
        
        acc1.allBal();


    }
}
