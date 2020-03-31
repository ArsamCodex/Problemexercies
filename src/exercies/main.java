package exercies;

public class main {
    public static void main ( String [] args){
       Account a1 = new Account();
        a1.display();
        a1.checkBalance();
        a1.verzenden(1000);
        a1.checkBalance();a1.withdraw(1500);
        a1.checkBalance();
        
    }
}
