import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        GestorDeTareasProyectos gestor = new GestorDeTareasProyectos();

        Proyecto proyecto1 = new Proyecto("Proyecto 1", "Proyecto Web", "2024-08-10", "2024-09-10");
        Proyecto proyecto2 = new Proyecto("Proyecto 2", "Proyecto Bancario", "2024-08-15", "2024-10-01");

        Usuario usuario1 = new Usuario("Usuario1", 2325);
        Usuario usuario2 = new Usuario("Usuario2", 535);

        try {
            gestor.AsignarProyecto(proyecto1);
            gestor.AsignarProyecto(proyecto2);

            gestor.AsignarUsuario(usuario1);
            gestor.AsignarUsuario(usuario2);

            Tarea tarea1 = new Tarea("Tarea 1", "Agenda bancaria", "2024-09-30", "Media", "Proceso");
            Tarea tarea2 = new Tarea("Tarea 2", "Loggin", "2024-08-20", "Urgente", "Terminada");
            Tarea tarea3 = new Tarea("Tarea 3", "Pagina web", "2024-10-29", "Baja", "Pendiente");

            gestor.AsignarTareaProyecto("Proyecto 1", tarea1);
            gestor.AsignarTareaProyecto("Proyecto 1", tarea2);
            gestor.AsignarTareaProyecto("Proyecto 2", tarea3);

            gestor.AsignarTareaUsuario("Usuario1", tarea1);
            gestor.AsignarTareaUsuario("Usuario2", tarea2);
            gestor.AsignarTareaUsuario("Usuario1", tarea3);

            System.out.println("Lista de Proyectos:");
            for (String nombreProyecto : gestor.getProyectos().keySet()) {
                System.out.println(nombreProyecto);
            }

            System.out.println("\nTareas en Proyecto 1:");
            Proyecto proyectoConsultado = gestor.getProyectos().get("Proyecto 1");
            for (Tarea tarea : proyectoConsultado.getTareas()) {
                System.out.println(tarea.getNombre() + " - Estado: " + tarea.getEstado());
            }

            System.out.println("\nTareas asignadas a Usuario1:");
            Usuario usuarioConsultado = gestor.getUsuarios().get("Usuario1");
            for (Tarea tarea : usuarioConsultado.getTareasAsignadas()) {
                System.out.println(tarea.getNombre() + " - Estado: " + tarea.getEstado());
            }

        } catch (GestorDeTareasProyectos.FechaInvalidaException |
                 GestorDeTareasProyectos.ProyectoNoEncontradoException |
                 GestorDeTareasProyectos.UsuarioNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
