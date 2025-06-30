public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Steve", 100);
        jugador.agregarItem("Espada de diamante");
        jugador.agregarItem("Pan");
        jugador.aparecer();
        jugador.interactuar();
        jugador.mostrarInventario();
        System.out.println("Tipo: " + jugador.obtenerTipo());

        System.out.println();

        Zombi zombi = new Zombi("Zombi1", 50, 3);
        zombi.aparecer();
        zombi.interactuar();
        System.out.println("Tipo: " + zombi.obtenerTipo());

        System.out.println();

        Aldeano aldeano = new Aldeano("Juan", 50, "Herrero");
        aldeano.aparecer();
        aldeano.interactuar();
        System.out.println("Tipo: " + aldeano.obtenerTipo());
    }
}
