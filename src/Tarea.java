public class Tarea {
    private String Titulo;
    private String Descripcion;
    private String FechaLimite;
    private String Prioridad;
    private String Estado;

    public Tarea(String Titulo, String Descripcion, String FechaLimite, String Prioridad, String Estado){
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.FechaLimite = FechaLimite;
        this.Prioridad = Prioridad;
        this.Estado = Estado;
    }

    public Tarea() {

    }

    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    public String getFechaLimite() {
        return FechaLimite;
    }
    public void setFechaLimite(String FechaLimite) {
        this.FechaLimite = FechaLimite;
    }
    public String getPrioridad() {
        return Prioridad;
    }
    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public boolean getNombre() {
        return false;
    }
}

