import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Amigo {
    private int idAmigo;
    private LocalDate fechaDeAMistad;
    private List<Mensaje> mensajes;

    public Amigo(int idAmigo, LocalDate fechaDeAMistad) {
        this.idAmigo = idAmigo;
        this.fechaDeAMistad = fechaDeAMistad;
        this.mensajes = new ArrayList<>();
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public int enviarMensaje(String contenido) {
        Mensaje mensaje = new Mensaje(mensajes.size() + 1, contenido, this);
        mensajes.add(mensaje);
        System.out.println("Mensaje enviado a " + idAmigo + ": " + contenido);
        return mensaje.getIdMensaje();
    }

    public int responderMensaje(int idRespuesta, String respuesta) {
        Mensaje mensajeOriginal = encontrarMensajePorId(idRespuesta);
        if (mensajeOriginal != null) {
            Mensaje mensajeRespuesta = new Mensaje(mensajes.size() + 1, respuesta, this);
            mensajeRespuesta.setIdRespuesta(mensajeOriginal.getIdMensaje());
            mensajes.add(mensajeRespuesta);
            return mensajeRespuesta.getIdMensaje();
        } else {
            System.out.println("No se encontró el mensaje original con ID: " + idRespuesta);
            return -1;
        }
    }

    public boolean eliminarMensaje(int idMensaje) {
        Mensaje mensaje = encontrarMensajePorId(idMensaje);
        if (mensaje != null) {
            mensajes.remove(mensaje);
            System.out.println("Mensaje eliminado de " + idAmigo);
            return true;
        } else {
            System.out.println("No se encontró el mensaje con ID " + idMensaje);
            return false;
        }
    }

    public Mensaje encontrarMensajePorId(int idMensaje) {
        for (Mensaje mensaje : mensajes) {
            if (mensaje.getIdMensaje() == idMensaje) {
                return mensaje;
            }
        }
        return null;
    }

    public int getId() {
        return idAmigo;
    }
}
