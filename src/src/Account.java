public class Account {
    private long account_number;
    private double amount = 0;
    private char account_type;
    private double amount_max;

    public Account(long account_numbe, char account_types) {
        if (account_types!='A' && account_types!='B' && account_types!='C') {
            System.out.println("\n TIPO NO VALIDO, CUENTA VACIA");
            this.account_number=0;
            account_type=' ';
        } else{
            this.account_number = account_numbe;
            account_type = account_types;
            if (account_type == 'A') {
                amount_max = 50000;
            } else if (account_type == 'B') {
                amount_max = 100000;
            }
        }

    }




    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    public double getAmount() {
        return amount;
    }

    public char getAccount_type(){
        return account_type;
    }

    public void setAmount(double amounts) {
        if (account_type=='A' || account_type=='B') {
            if (amount < amount_max && amount + amounts < amount_max) {
                amount += amounts;
            }  else{
                System.out.println("DEMASIADO VALOR");
            }


        }else if (account_type=='C'){
            amount += amounts;
        }
    }

    public void extamount ( double ext){
        if (account_type=='A') {
            if (ext>=1000 && ext<amount_max && ext<amount){
                amount-=ext;
            } else{
                System.out.println("CANTIDAD INADECUADA");
            }
        } else if (account_type=='B'){
            if (ext>=5000 && ext<amount_max && ext<amount){
                amount-=ext;
            } else{
                System.out.println("CANTIDAD INADECUADA");
            }
        } else if (account_type=='C') {
            if (ext>=10000 && ext<amount_max && ext<amount){
                amount-=ext;
            } else{
                System.out.println("CANTIDAD INADECUADA");
            }
        }
    }
}
