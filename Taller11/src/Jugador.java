public class Jugador {
    private String nombre;
    private int salud;
    private String[] herramientas;
    public Jugador(String nombre, int salud, String[] herramientas) {
        this.nombre = nombre;
        this.salud = salud;
        this.herramientas = herramientas;
    }
    public void mostrarInventario() {
        System.out.println("Herramientas: ");
        for (String herramienta : herramientas) {
            System.out.println(herramienta);
        }
    }
}
