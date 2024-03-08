import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        char c;
        System.out.println("BIENVENIDO AL SISTEMA BANCARIO");
        do {
            System.out.println("Que accion desea realizar?\n "  +
                    "1. Crear una cuenta empleado con cuenta bancaria. \n" +
                    "2. Añadir una cuenta bancaria a un empleado. \n" +
                    "3. Añadir fondos a una cuenta bancaria. \n" +
                    "4. Retirar fondos de una cuenta bancaria. \n " +
                    "5. Mostrar todos los empleados. \n" +
                    "6. Mostrar todas mis cuentas bancarias. \n" +
                    "E= EXIT \n");
            c = read.next().charAt(0);
            switch (c) {
                case '1':
                    System.out.println("Ingresa el nombre de tu empleado: ");
                    String name = read.next();
                    System.out.println("Ingresa el apellido de tu empleado");
                    String last_name = read.next();
                    System.out.println("Ingresa el tipo de cuenta");
                    char type = read.next().charAt(0);
                    new Employee(name,last_name,type);
                    break;
                case '2':
                    System.out.println("A que empleado quieres agregar cuentas?, di nombre. ");
                    String name1 = read.next();
                    System.out.println("Di apellido");
                    String last_name1 = read.next();
                    boolean band= Bank.search_employe(name1,last_name1);
                    if (band){
                        Employee empi=Bank.search_employee(name1,last_name1);
                        System.out.println("Ingresa el tipo de cuenta que quieres crear.");
                        char type1= read.next().charAt(0);
                        empi.addBankaccount(type1);
                        break;
                    }
                    System.out.println("EMPLEADO NO EXISTENTE. ");
                    break;
                case '3':
                    System.out.println("A que empleado quieres añadir fondos?, di nombre. ");
                    String name2 = read.next();
                    System.out.println("Di apellido");
                    String last_name2 = read.next();
                    boolean bandi= Bank.search_employe(name2,last_name2);
                    if (bandi){
                        Employee emp= Bank.search_employee(name2,last_name2);
                        int cuentas =emp.get_acc_number(emp);
                        System.out.println("A que cuenta quieres agregar? El empleado tiene "+ cuentas+ " cuentas. (Empieza desde 0)");
                        int index = read.nextInt();
                        System.out.println("Cuanto dinero quieres agregar? ");
                        double canti = read.nextDouble();
                        emp.get_account(index).setAmount(canti);
                        break;
                    } else{
                        System.out.println("EMPLEADO NO EXISTENTE");
                        break;
                    }

                case '4':
                    System.out.println("A que empleado quieres retirar fondos?, di nombre. ");
                    String name3 = read.next();
                    System.out.println("Di apellido");
                    String last_name3 = read.next();
                    boolean band2= Bank.search_employe(name3,last_name3);
                    if (band2){
                        Employee empil= Bank.search_employee(name3,last_name3);
                        int cuentass =empil.get_acc_number(empil);
                        System.out.println("A que cuenta quieres retirar? El empleado tiene "+ cuentass+ " cuentas y sus fondos son: . (Empieza desde 0)");
                        empil.printAccounts();
                        int indexx = read.nextInt();
                        System.out.println("Cuanto dinero quieres retirar? ");
                        double cantii = read.nextDouble();
                        empil.get_account(indexx).extamount(cantii);
                        break;
                    } else{
                        System.out.println("EMPLEADO NO EXISTENTE.");
                        break;
                    }

                case '5':
                    Bank.printAllEmployees();
                    break;
                case '6':
                    System.out.println("De que empleado deseas conocer las cuentas bancarias?, di nombre. ");
                    String name4 = read.next();
                    System.out.println("Di apellido");
                    String last_name4 = read.next();
                    boolean band3= Bank.search_employe(name4,last_name4);
                    if (band3){
                        Employee empili= Bank.search_employee(name4,last_name4);
                        empili.printAccounts();
                        break;
                    } else{
                        System.out.println("EMPLEADO NO EXISTENTE. ");
                        break;
                    }

            }
        }while (c != 'E') ;






    }
}

