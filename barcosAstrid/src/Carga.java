public abstract class Carga {
    private String nombre,descripcion;

    public Carga(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public abstract Double calcularPeso();

    @Override
    public String toString() {
        return "Carga{" +
                "nombre='" + nombre + '\'' +
                ", pesoCarga='" + calcularPeso() + '\'' +
                '}';
    }
}
