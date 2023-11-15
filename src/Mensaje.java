public class Mensaje {
    private int idMensaje;
    private String contenido;
    private int idRespuesta;  // Cambiado de Mensaje a int
    private Amigo remitente;

    public Mensaje(int idMensaje, String contenido, Amigo remitente) {
        this.idMensaje = idMensaje;
        this.contenido = contenido;
        this.remitente = remitente;
        this.idRespuesta = -1;  //  por defecto cuando no hay respuesta
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public String getContenido() {
        return contenido;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public Amigo getRemitente() {
        return remitente;
    }
}
