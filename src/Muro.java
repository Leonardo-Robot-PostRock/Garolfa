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
        // Lógica para actualizar el muro (puede incluir la actualización de la lista de publicaciones)
        System.out.println("Muro actualizado.");
        return true;
    }

    // Método para filtrar publicaciones
    public List<Publicacion> filtrarPublicaciones(String filtro) {
        List<Publicacion> publicacionesFiltradas = new ArrayList<>();

        for (Publicacion publicacion : this.publicaciones) {
            // Aquí debes implementar la lógica de filtrado según tus necesidades
            // En este ejemplo, se filtra por título, pero puedes ajustarlo según tus requisitos
            if (publicacion.getTitulo().contains(filtro)) {
                publicacionesFiltradas.add(publicacion);
            }
        }

        return publicacionesFiltradas;
    }
}
