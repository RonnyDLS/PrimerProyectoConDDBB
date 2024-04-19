
package Main;

import ClassAbstract.Calificaciones;
import InterfazClase.IOperaciones;

public class Nota extends Calificaciones implements IOperaciones{
    
    private double totalNota;

    public Nota(double ptObte, double pt){
        super(ptObte, pt);
    }
    
    public double getTotalNota(){
        return totalNota;
    }
    
    @Override
    public double sumaTotal() {
        totalNota = ptObte + pt;
        return  totalNota;
    }
    
}
