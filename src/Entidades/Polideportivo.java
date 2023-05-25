
package Entidades;

public class Polideportivo extends Edificio {

    private String nombreEd;
    private String tipoInstalacion;


   @Override
    public double calcularSuperficie() {
      return 2 * ((super.getAncho() * super.getAlto()) + (super.getAlto() * super.getLargo()) + (super.getLargo() * super.getAncho()));
    }

    @Override
     public double calcularVolumen() {
        return super.getAncho() * super.getAlto() * super.getLargo();
    }
    
        public Polideportivo() {
    }

    public Polideportivo(String nombreEd, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombreEd = nombreEd;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
    
    
    
}
