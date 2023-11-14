import java.util.ArrayList;
import java.util.List;

public class Muro {
    private int id;
    private int perfil_id;
    private List<Publicacion> publicaciones;

    public Muro() {
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
    }

    public List<Publicacion> mostrarPublicaciones() {
        return this.publicaciones;
    }

    // Método para filtrar publicaciones
    public List<Publicacion> filtrarPublicaciones() {
        return this.publicaciones;
    }
}
