
package Entidades;

import java.util.Scanner;

public class EdificioOficinas extends Edificio {
 
    Scanner sc = new Scanner(System.in);
    private int numOficinas;
    private int cantPersonas;
    private int numPisos;
    
    @Override
    public double calcularSuperficie() {
      return 2 * ((super.getAncho() * super.getAlto()) + (super.getAlto() * super.getLargo()) + (super.getLargo() * super.getAncho()));
    }

    @Override
    public double calcularVolumen() {
       return super.getAncho() * super.getAlto() * super.getLargo();
    }

    public EdificioOficinas() {
    }

    public EdificioOficinas(int numOficinas, int cantPersonas, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    
    public Integer cantidadPersonasXpiso(){
        numPisos = numOficinas;
        return cantPersonas;
    }
     public Integer cantidadPersonasXedificio(){      
        return  cantPersonas * numPisos;
     }
}
