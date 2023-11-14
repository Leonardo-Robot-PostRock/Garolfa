import java.util.List;

public class Perfil extends Usuario {
    private int id;
    private String sexo;
    private String direccion;
    private String formacion;
    private String estadoCivil;
    private Foto fotoPerfil;
    private String biografia;
    private  Ajustes ajustes;

    private List<Publicacion> publicaciones;
    private Muro muro;

    public Perfil(String nombre, String apodo, int telefono, int edad, String correo) {
        super(nombre, apodo, telefono, edad, correo);
    }



    public Perfil(String nombre, String apodo, int telefono, int edad, String correo, String sexo, String direccion, String formacion, String estadoCivil, Foto fotoPerfil, String biografia, List<Publicacion> publicaciones) {
        super(nombre, apodo, telefono, edad, correo);
        this.sexo = sexo;
        this.direccion = direccion;
        this.formacion = formacion;
        this.estadoCivil = estadoCivil;
        this.fotoPerfil = fotoPerfil;
        this.biografia = biografia;
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

    public boolean enviarSolicitud(int solicitud) {
        return true;
    }

    public int aceptarSolicitud(int solicitud) {
        return solicitud;
    }

    public int eliminarAmigo(int idAmigo) {
        return idAmigo;
    }

    public int rechazarSolicitud(int idAmigoDestino) {
        return idAmigoDestino;
    }

    // Obtener las publicaciones del muro
    public List<Publicacion> obtenerPublicaciones() {
        return muro.mostrarPublicaciones();
    }
}
