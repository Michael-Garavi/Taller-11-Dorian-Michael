public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Steve", 100, new String[]{"Espada", "Pico", "Comida"});
        Zombi zombi = new Zombi("Zombi1", 50, 3);
        Aldeano aldeano = new Aldeano("Juan", 30, "Agricultor");

        EntidadMinecraft[] entidades = new EntidadMinecraft[]{ zombi, aldeano};

        for (EntidadMinecraft entidad : entidades) {
            entidad.aparecer();
            entidad.interactuar();
            System.out.println("Tipo: " + entidad.obtenerTipo());
            System.out.println();
        }

        jugador.mostrarInventario();
    }
}