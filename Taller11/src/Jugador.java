public class Jugador extends EntidadBase {
    private String[] inventario;

    public Jugador(String nombre, int salud, String[] inventario) {
        super(nombre, salud);
        this.inventario = inventario;
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " está interactuando con el entorno.");
    }

    @Override
    public String obtenerTipo() {
        return "Jugador";
    }

    public void mostrarInventario() {
        System.out.print("Inventario de " + nombre + ": ");
        for (String item : inventario) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}