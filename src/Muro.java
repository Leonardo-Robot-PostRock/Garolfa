import java.util.ArrayList;
import java.util.List;

public class Muro {
    private int id;
    private int perfil_id;
    private List<Publicacion> publicaciones;

    public Muro(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public void agregarPublicacion(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
    }

    public List<Publicacion> mostrarPublicaciones() {
        return this.publicaciones;
    }

    public boolean actualizarMural() {
        return true;
    }

    // Método para filtrar publicaciones
    public List<Publicacion> filtrarPublicaciones() {
        return this.publicaciones;
    }
}
