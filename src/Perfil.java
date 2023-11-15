import java.util.List;

public class Perfil extends Usuario {
    private int id;
    private String sexo;
    private String direccion;
    private String formacion;
    private String estadoCivil;
    private Foto fotoPerfil;
    private String biografia;
    private Ajustes ajustes;

    private List<Publicacion> publicaciones;
    private List<Amigo> amigos;
    private List<Perfil> amigosPendientes;
    private List<Perfil> amigosAceptados;
    private Muro muro;

    public Perfil(String nombre, String apodo, int telefono, int edad, String correo) {
        super(nombre, apodo, telefono, edad, correo);
    }


    public Perfil(String nombre, String apodo, int telefono, int edad, String correo, String sexo, String direccion, String formacion, String estadoCivil, Foto fotoPerfil, String biografia, List<Publicacion> publicaciones, List<Amigo> amigos) {
        super(nombre, apodo, telefono, edad, correo);
        this.sexo = sexo;
        this.direccion = direccion;
        this.formacion = formacion;
        this.estadoCivil = estadoCivil;
        this.fotoPerfil = fotoPerfil;
        this.biografia = biografia;
        this.amigos = amigos;
        this.muro = new Muro(publicaciones);
    }

    public Ajustes getAjustes() {
        return ajustes;
    }

    public void setAjustes(Ajustes ajustes) {
        this.ajustes = ajustes;
    }

    public boolean actualizarPerfil() {
        return true;
    }

    public boolean enviarSolicitud(Perfil amigo) {
        return amigosPendientes.add(amigo);
    }

    public boolean aceptarSolicitud(Perfil amigo) {
        boolean solicitudAceptada = amigosPendientes.remove(amigo);
        if (solicitudAceptada) {
            amigosAceptados.add(amigo);
            amigo.amigosAceptados.add(this);

        }
        return solicitudAceptada;
    }

    public boolean eliminarAmigo(Perfil amigo) {
        boolean eliminado = amigosAceptados.remove(amigo);
        if (eliminado) {
            amigo.amigosAceptados.remove(this);
        }
        return eliminado;
    }

    public int rechazarSolicitud(int idAmigoDestino) {
        return idAmigoDestino;
    }

    // Obtener las publicaciones del muro
    public List<Publicacion> obtenerPublicaciones() {
        return muro.mostrarPublicaciones();
    }
}
