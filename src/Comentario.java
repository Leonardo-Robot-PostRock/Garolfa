import java.util.ArrayList;
import java.util.List;

public class Comentario {
    private int id;
    private String comentario;
    private String fechaDeCreacion;
    private int idPublicacion;
    private int idCuenta;
    private List<String> meGustaUsuarios;  // Lista para almacenar los usuarios que dieron "Me gusta"

    public Comentario(String comentario, String fechaDeCreacion, int idPublicacion, int idCuenta) {
        this.comentario = comentario;
        this.fechaDeCreacion = fechaDeCreacion;
        this.idPublicacion = idPublicacion;
        this.idCuenta = idCuenta;
        this.meGustaUsuarios = new ArrayList<>();
    }

    public boolean enviarComentario() {
        System.out.println("Comentario enviado: " + comentario);
        return true;
    }

    public boolean eliminarComentario() {
        System.out.println("Comentario eliminado: " + comentario);
        return true;
    }

    public boolean meGustaComentario(String usuario) {
        if (!meGustaUsuarios.contains(usuario)) {
            meGustaUsuarios.add(usuario);
            System.out.println("Me gusta agregado al comentario: " + comentario);
            return true;
        } else {
            System.out.println("El usuario ya dio Me gusta a este comentario.");
            return false;
        }
    }

    public boolean noMeGustaComentario(String usuario) {
        if (meGustaUsuarios.contains(usuario)) {
            meGustaUsuarios.remove(usuario);
            System.out.println("No me gusta agregado al comentario: " + comentario);
            return true;
        } else {
            System.out.println("El usuario no dio Me gusta previamente a este comentario.");
            return false;
        }
    }
}
