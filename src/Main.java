import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        // Crear perfiles
        Perfil perfil1 = new Perfil(1, "Juan", "juanito", 123456789, 25, "juan@gmail.com");
        Perfil perfil2 = new Perfil(2, "Maria", "mary", 987654321, 22, "maria@gmail.com", "Femenino", "Calle 123", "Universidad X", "Soltera", new Foto(1, "enlace_de_maria"), "Biografía de Maria", new ArrayList<>());

        // Enviar solicitud de amistad
        perfil1.enviarSolicitud(perfil2);
        perfil2.aceptarSolicitud(perfil1.getAmigos().get(0));

        // Enviar mensajes
        perfil1.getAmigos().get(0).enviarMensaje("Hola, ¿cómo estás?");
        perfil2.getAmigos().get(0).responderMensaje(1, "¡Hola! Estoy bien, ¿y tú?");

        // Mostrar mensajes
        mostrarMensajes(perfil1);
        mostrarMensajes(perfil2);
    }

    private static void mostrarMensajes(Perfil perfil) {
        System.out.println("Mensajes de " + perfil.getId());
        for (Amigo amigo : perfil.getAmigos()) {
            for (Mensaje mensaje : amigo.getMensajes()) {
                System.out.println("ID: " + mensaje.getIdMensaje());
                System.out.println("Contenido: " + mensaje.getContenido());

                int idRespuesta = mensaje.getIdRespuesta();
                if (idRespuesta != -1) {
                    Mensaje mensajeRespuesta = amigo.encontrarMensajePorId(idRespuesta);
                    if (mensajeRespuesta != null) {
                        System.out.println("Respuesta: " + mensajeRespuesta.getContenido());
                    }
                }

                System.out.println("Remitente ID: " + mensaje.getRemitente().getId());
                System.out.println("--------------------");
            }
        }
    }

}
