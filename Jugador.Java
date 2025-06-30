import java.util.ArrayList;
import java.util.List;

public class Jugador extends EntidadBase {
    private List<String> inventario;

    public Jugador(String nombre, int salud) {
        super(nombre, salud);
        this.inventario = new ArrayList<>();
    }

    public void agregarItem(String item) {
        inventario.add(item);
    }

    public void mostrarInventario() {
        System.out.println(nombre + " tiene en su inventario: " + inventario);
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " está explorando el mundo.");
    }

    @Override
    public String obtenerTipo() {
        return "Jugador";
    }
}
