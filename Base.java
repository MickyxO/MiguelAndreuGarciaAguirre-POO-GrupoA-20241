public class Base {
    public static void main(String[] args) {
        // Tu código comienza aquí
        Rectangle r1= new Rectangle();
        System.out.println("Clase rectangulos. ");
        System.out.printf(String.format("El area es %d \n",r1.area_calculus(12,43)));
        System.out.printf(String.format("El area es %.2f \n",r1.area_calculus(12.4,43.2)));
        System.out.printf(String.format("El area es %.2f \n",r1.area_calculus(12,43.4)));

        // Clase empleado
        Employee e1= new Employee();
        System.out.println("Clase empleados. ");
        System.out.printf(String.format("El sueldo es $%.2f \n",e1.calcular_saldo(234)));
        System.out.printf(String.format("El sueldo es $%.2f \n",e1.calcular_saldo(234,100)));
        System.out.printf(String.format("El sueldo es $%.2f \n",e1.calcular_saldo(234,100,5)));

        //Calculadora de impuestos

         CalcImpuestos i1 = new CalcImpuestos();
        System.out.println("Clase impuestos. ");

        System.out.printf(String.format("Los impuestos son $%.4f \n",i1.cal_taxes(123)));
        System.out.printf(String.format("Los impuestos son $%.4f \n",i1.cal_taxes(123,45.5)));
        System.out.printf(String.format("Los impuestos son $%.4f \n",i1.cal_taxes(123,50.2,45.2)));


        // Tu código termina aquí
    }
}
