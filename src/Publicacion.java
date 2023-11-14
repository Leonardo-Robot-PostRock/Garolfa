public class Publicacion {
    private int id;
    private String titulo;
    private String fechaDeCreacion;
    private Foto foto;

    public Publicacion(String titulo, String fechaDeCreacion) {
        this.titulo = titulo;
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Publicacion(String titulo, String fechaDeCreacion, Foto foto) {
        this.titulo = titulo;
        this.fechaDeCreacion = fechaDeCreacion;
        this.foto = foto;
    }

    public boolean meGustaPublicacion(){
        return true;
    }

    public boolean quitarMeGustaDePublicacion(){
        return true;
    }

    public void editarPublicacion(){

    }

}
