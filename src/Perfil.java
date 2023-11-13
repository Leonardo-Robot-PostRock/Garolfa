public class Perfil extends Usuario{
    private int id;
    private String sexo;
    private String direccion;
    private String formacion;
    private String estadoCivil;
    private String fotoPerfil;
    private String biografia;

    public Perfil(String nombre, String apodo, int telefono, int edad, String correo) {
        super(nombre, apodo, telefono, edad, correo);
    }

    public Perfil(String nombre, String apodo, int telefono, int edad, String correo, String sexo, String direccion, String formacion, String estadoCivil, String fotoPerfil, String biografia) {
        super(nombre, apodo, telefono, edad, correo);
        this.sexo = sexo;
        this.direccion = direccion;
        this.formacion = formacion;
        this.estadoCivil = estadoCivil;
        this.fotoPerfil = fotoPerfil;
        this.biografia = biografia;
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
}
