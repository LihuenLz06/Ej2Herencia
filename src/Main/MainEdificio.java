
package Main;

import Entidades.Edificio;
import Entidades.EdificioOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.List;

public class MainEdificio {

    public static void main(String[] args) {
        
        List <Edificio> edificios = new ArrayList();
        edificios.add(new EdificioOficinas(10, 15, 10, 30, 30, 40));
        edificios.add(new EdificioOficinas(8, 7, 8, 25, 25, 30));
        edificios.add(new Polideportivo("Villa 25", "Techado", 80, 40, 6));
        edificios.add(new Polideportivo("Deportivo N°2", "Abierta", 100, 70, 0));
        
         int techado = 0;
                int abierto = 0;
        for (Edificio EdifAux : edificios) {
            if (EdifAux instanceof EdificioOficinas) {
                EdificioOficinas edOf = (EdificioOficinas) EdifAux; // Casting: manera de crear un objeto de la clase hija especifica para poder hacer uso de sus metodos y atributos, 
                // ya que lo unico que tengo creado es un arraylist de Edificio, y yo necesito acceder o instanciar las clases hijas para poder mostrar sus datos.
                System.out.println("La cantidad de personas por piso son: " + edOf.cantidadPersonasXpiso());
                System.out.println("La cantidad de personas por Edificio son: " + edOf.cantidadPersonasXedificio());
            } else if (EdifAux instanceof Polideportivo){
                Polideportivo edP = (Polideportivo) EdifAux;
                if (edP.getTipoInstalacion().equalsIgnoreCase("techado")) {
                    techado++;
                } else {
                    abierto++;
                }
            }
            System.out.println("La superficie es: " + EdifAux.calcularSuperficie());
            System.out.println("El volumen es: " + EdifAux.calcularVolumen());
        }
       System.out.println("La cantidad de polideportivos techados son: " + techado);
                System.out.println("La cantidad de polideportivos abiertos son: " + abierto);
                
      
    }
    

}
