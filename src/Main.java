
public class Main {

    public static void main(String[] args) {
        Client leonardo = new Client();
        leonardo.setName("Leonardo");

        Account cc = new checkingAccounts(leonardo);
        Account saving = new SavingAccount(leonardo);

        cc.deposit(100);
        cc.transfer(100, saving);

        cc.printExtract();
        saving.printExtract();
    }
}
