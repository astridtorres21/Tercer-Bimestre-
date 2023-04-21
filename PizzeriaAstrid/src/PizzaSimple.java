import java.util.List;
import java.util.ArrayList;

public class PizzaSimple implements Pizza{
    private String nombre,descipcion;
    private double costoBase;
    private boolean esEspecial;

    public PizzaSimple(String nombre, String descipcion) {
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.costoBase = 0.0;
        this.esEspecial = false;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public void setEsEspecial(boolean esEspecial) {
        this.esEspecial = esEspecial;
    }

    private String esEspecial(){
        if (this.esEspecial == true){
            return "Si";
        }else {
            return "No";
        }
    }

    @Override
    public Double costo() {
        if(this.esEspecial){
            return this.costoBase * 1.7;
        }else {
            return this.costoBase;
        }
    }

    @Override
    public String toString() {
        return this.nombre+"{" +
                "nombre='" + nombre + '\'' +
                ", descipcion='" + descipcion + '\'' +
                ", costo=" + this.costoBase +
                ", esEspecial=" + this.esEspecial() +
                '}';
    }
}
