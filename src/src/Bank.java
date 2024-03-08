import java.util.ArrayList;
public class Bank {
    public static ArrayList<Employee> accounts = new ArrayList<>();

    public static void addEmployee (Employee employee){
        accounts.add(employee);
    }



    public static void printAllEmployees() {
        for (Employee emp : accounts) {
            System.out.println("Empleado: " + emp.getName() + " " + emp.getLast_name());
            emp.printAccounts();
            System.out.println(); // Salto de línea para separar los resultados de cada empleado
        }
    }

    public static void printAEmploye(int index){
        if (index >= 0 && index < accounts.size()) {
            Employee emp = accounts.get(index);
            System.out.println("Empleado: " + emp.getName() + " " + emp.getLast_name());
            emp.printAccounts();
            System.out.println(); // Salto de línea para separar los resultados de cada empleado
        }else{
            System.out.println("Índice fuera de rango.");
        }


    }

    public static boolean search_employe (String name, String last_n) {
        boolean band=false;
        Employee aux = null;
        for (Employee emp : accounts) {
            if (name.equalsIgnoreCase(emp.getName()) && last_n.equalsIgnoreCase(emp.getLast_name())) {
                band=true;
                break;
            }
        }
        return band;
    }


    public static Employee search_employee (String name, String last_n){
        Employee aux= null;
        for (Employee emp: accounts){
            if (name.equalsIgnoreCase(emp.getName()) && last_n.equalsIgnoreCase(emp.getLast_name())){
                aux=emp;
                break;
            }
        }
        return aux;
    }

    public static int search_employee_ind (String name, String last_n){
        int aux=0;
        int i=0;
        for (Employee emp: accounts){
            i++;
            if (name.equalsIgnoreCase(emp.getName()) && last_n.equalsIgnoreCase(emp.getLast_name())){
                aux=i;
                break;
            }
        }
        return aux;
    }


}
