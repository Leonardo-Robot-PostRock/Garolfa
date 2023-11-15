import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perfil extends Usuario {
    private int id;
    private String sexo;
    private String direccion;
    private String formacion;
    private String estadoCivil;
    private Foto fotoPerfil;
    private String biografia;

    private List<Publicacion> publicaciones;
    private Muro muro;
    private List<Amigo> amigos;

    public Perfil(int id, String nombre, String apodo, long telefono, int edad, String correo) {
        super(nombre, apodo, telefono, edad, correo);
        this.id = id;
        this.amigos = new ArrayList<>();
    }

    public Perfil(int id, String nombre, String apodo, long telefono, int edad, String correo, String sexo, String direccion, String formacion, String estadoCivil, Foto fotoPerfil, String biografia, List<Publicacion> publicaciones) {
        super(nombre, apodo, telefono, edad, correo);
        this.id = id;
        this.sexo = sexo;
        this.direccion = direccion;
        this.formacion = formacion;
        this.estadoCivil = estadoCivil;
        this.fotoPerfil = fotoPerfil;
        this.biografia = biografia;
        this.amigos = new ArrayList<>();
        this.muro = new Muro(publicaciones);
    }

    public int getId() {
        return id;
    }

    public boolean actualizarPerfil() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Deseas actualizar tu información? (Sí/No): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("Sí")) {
            System.out.println("Ingresa el nuevo sexo: ");
            this.sexo = scanner.nextLine();

            System.out.println("Ingresa la nueva dirección: ");
            this.direccion = scanner.nextLine();

            System.out.println("Ingresa la nueva formación: ");
            this.formacion = scanner.nextLine();

            System.out.println("Ingresa el nuevo estado civil: ");
            this.estadoCivil = scanner.nextLine();

            System.out.println("Ingresa la nueva biografía: ");
            this.biografia = scanner.nextLine();

            System.out.println("Perfil actualizado para " + getId());
            return true;
        } else {
            System.out.println("Perfil no actualizado.");
            return false;
        }
    }

    // Enviar solicitud de amistad
    public boolean enviarSolicitud(Perfil amigo) {
        Amigo nuevaSolicitud = new Amigo(amigo.getId(), LocalDate.now());
        System.out.println("Solicitud enviada a " + amigo.getId());
        return amigos.add(nuevaSolicitud) && amigo.getAmigos().add(new Amigo(getId(), LocalDate.now()));
    }


    public int aceptarSolicitud(Amigo amigo) {
        System.out.println("Solicitud aceptada de " + amigo.getId());
        amigos.add(amigo);
        return amigo.getId();
    }

    public int eliminarAmigo(Amigo amigo) {
        System.out.println("Amigo eliminado: " + amigo.getId());
        amigos.remove(amigo);
        return amigo.getId();
    }

    public int rechazarSolicitud(Amigo amigo) {
        System.out.println("Solicitud rechazada de " + amigo.getId());
        return amigo.getId();
    }

    public List<Amigo> getAmigos() {
        return amigos;
    }

    // Obtener las publicaciones del muro
    public List<Publicacion> obtenerPublicaciones() {
        return muro.mostrarPublicaciones();
    }
}
