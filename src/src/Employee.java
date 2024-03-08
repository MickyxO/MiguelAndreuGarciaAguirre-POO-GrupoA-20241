import java.util.ArrayList;
import java.util.Random;
public class Employee {
    Random ran = new Random();


    private String name;
    private String last_name;

    private Account cuenta; //juntas la clase con la otra

    private ArrayList<Account> bank_accounts = new ArrayList<>();


    public void addBankaccount(char type) {
        if (type == 'A' || type == 'B' || type == 'C') {
            this.cuenta = new Account(generate_number(), type);
            bank_accounts.add(this.cuenta);
        } else {
            System.out.println("NO SE PUDO CREAR LA CUENTA");
        }
    }

    public Employee(String name, String last_name,  char type) { //este constructor es para crear una cuenta al mismo tiempo
        if (type == 'A' || type == 'B' || type == 'C') {
            this.name = name;
            this.last_name = last_name;
            this.cuenta = new Account(generate_number(), type);
            bank_accounts.add(this.cuenta);
            Bank.addEmployee(this);
        } else {
            System.out.println("NO SE PUDO CREAR LA CUENTA");
        }

    }

    public String getName() {
        return name;
    }

    public Account get_account(int index) {
        return bank_accounts.get(index);
    }



    public int get_acc_number(Employee emp){
        return emp.bank_accounts.size();
    }

    public void printAccount(int index) {
        System.out.printf("Número de cuenta: %d, saldo: %.2f, tipo de cuenta: '%c'\n",
                bank_accounts.get(index).getAccount_number(), bank_accounts.get(index).getAmount(), bank_accounts.get(index).getAccount_type());
    }

    public void printAccounts() {
        for (Account account : bank_accounts) {
            System.out.printf("Número de cuenta: %d, saldo: %.2f, tipo de cuenta: '%c'\n",
                    account.getAccount_number(), account.getAmount(), account.getAccount_type());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public long generate_number() {
        boolean band;
        while (true) {
            band = true;
            long x = ran.nextLong(1000,5000);
            for (Account account : bank_accounts) {
                if (account.getAccount_number() == x) {
                    band = false;
                    break; // Salir del bucle for una vez que se haya encontrado un número repetido
                }
            }
            if (band) {
                return x;
            }
        }
    }


}
