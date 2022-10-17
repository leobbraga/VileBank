
public class checkingAccounts extends Account {

    public checkingAccounts(Client client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("=== Cheking Account Extract ===");
        super.printCommonInfo();
    }

}


