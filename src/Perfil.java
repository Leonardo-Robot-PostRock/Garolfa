public class Perfil {
    private int id;
    private String sexo;
    private String direccion;
    private String formacion;
    private String estadoCivil;
    private String fotoPerfil;
    private String biografia;

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
