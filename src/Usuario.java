import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona{
    private List<Tarea> tareas;

    public Usuario(String nombre, int ID) {
        super(nombre, ID);
        tareas = new ArrayList<Tarea>();
    }
    public void TareasAsignadas(Tarea tarea){
        tareas.add(tarea);
    }
    public List<Tarea> getTareas() {
        return tareas;
    }

    public Tarea[] getTareasAsignadas() {
        return tareas.toArray(new Tarea[tareas.size()]);
    }

    public void AsignarTarea(Tarea tarea) {
    }
}
