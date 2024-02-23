public class CalcImpuestos {

    public double cal_taxes (int ingresos){
        return (ingresos+(ingresos*0.15));
    }

    public double cal_taxes (int ingresos,double por_impuesto){
        return (ingresos+(por_impuesto/100));
    }
    public double cal_taxes (double dividendo, double por_impuesto, double exencion){
       double taxes, fin;
       taxes = dividendo * (por_impuesto / 100);
       if (taxes>exencion){
           fin = taxes-exencion;
       } else{
           fin = 0;
       }

        return fin;
    }
}
