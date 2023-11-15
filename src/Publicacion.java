import java.util.Date;

public class Publicacion {
    private int id;
    private String titulo;
    private Date fechaDeCreacion;
    private Foto foto;
    private boolean leGusta;

    public Publicacion(String titulo, Date fechaDeCreacion) {
        this.titulo = titulo;
        this.fechaDeCreacion = fechaDeCreacion;
        this.leGusta = false; // Inicialmente, a nadie le gusta la publicación
    }

    public Publicacion(String titulo, Date fechaDeCreacion, Foto foto) {
        this.titulo = titulo;
        this.fechaDeCreacion = fechaDeCreacion;
        this.foto = foto;
        this.leGusta = false; // Inicialmente, a nadie le gusta la publicación
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean meGustaPublicacion() {
        if (!leGusta) {
            System.out.println("Me gusta agregado a la publicación: " + titulo);
            leGusta = true;
            return true;
        } else {
            System.out.println("Ya te gusta esta publicación.");
            return false;
        }
    }

    public boolean quitarMeGustaDePublicacion() {
        if (leGusta) {
            System.out.println("Me gusta quitado de la publicación: " + titulo);
            leGusta = false;
            return true;
        } else {
            System.out.println("No te gusta esta publicación.");
            return false;
        }
    }

    public void editarPublicacion(String nuevoContenido) {
        System.out.println("Publicación editada: " + titulo);
        // Puedes agregar la lógica para editar el contenido de la publicación aquí
        // Por ejemplo, asignar el nuevo contenido al título
        this.titulo = nuevoContenido;
    }

}
