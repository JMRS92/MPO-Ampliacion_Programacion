package mapa.notas;

/**
 * Clase Asignatura
 *
 * @author Alumno Julio Martín Rodríguez Sánchez
 * @version 1.0
 */
public class Asignatura {
    //Atributos privados
    private String nombre;
    private int nota;

    //Constructor
    public Asignatura(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public static void setNota(int nota) {
        this.nota = nota;
    }

    //Metodos
    @Override
    public String toString() {
        return String.format("Asignatura: %s, Notas: %d", nombre, nota);
    }

}
