import java.util.UUID;

public class Usuario extends Registro {
    private int id;
    private String password;
    private String correo;

    public Usuario(String nombre, String apodo, long telefono, int edad, String correo) {
        super(nombre, apodo, telefono, edad);
        this.correo = correo;
    }


    public void login() {

    }

    public boolean verificar() {
        return true;
    }

    public void registrarse() {

    }
}
