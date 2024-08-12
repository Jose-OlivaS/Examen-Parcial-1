import java.util.HashMap;
import java.util.Map;

public class GestorDeTareasProyectos {

    private Map<String, Proyecto> proyectos;
    private Map<String, Usuario> usuarios;

    public GestorDeTareasProyectos() {
        proyectos = new HashMap<>();
        usuarios = new HashMap<>();
    }

    public void AsignarProyecto(Proyecto proyecto) throws FechaInvalidaException {
        if (proyecto.getFechaInicio().compareTo(proyecto.getFechaFin()) > 0) {
            throw new FechaInvalidaException("La fecha de inicio no es válida.");
        }
        proyectos.put(proyecto.getNombre(), proyecto);
    }

    public void AsignarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNombre(), usuario);
    }

    public void AsignarTareaProyecto(String nombre, Tarea tarea) throws ProyectoNoEncontradoException {
        Proyecto proyecto = proyectos.get(nombre);
        if (proyecto == null) {
            throw new ProyectoNoEncontradoException("El proyecto no existe.");
        }
        proyecto.AsignarTarea(tarea);
    }

    public void AsignarTareaUsuario(String IdUsuario, Tarea tarea) throws UsuarioNoEncontradoException {
        Usuario usuario = usuarios.get(IdUsuario);
        if (usuario == null) {
            throw new UsuarioNoEncontradoException("El usuario no existe.");
        }
        usuario.AsignarTarea(tarea);
    }

    public Map<String, Proyecto> getProyectos() {
        return proyectos;
    }

    public Map<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public class FechaInvalidaException extends Exception {
        public FechaInvalidaException(String mensaje) {
            super(mensaje);
        }
    }

    public class ProyectoNoEncontradoException extends Exception {
        public ProyectoNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }

    public class UsuarioNoEncontradoException extends Exception {
        public UsuarioNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }
}
