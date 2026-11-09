package universidad2;

/**
 * Clase alumno: aquí van las variables (datos) de cada alumno.
 */
public class alumno {

    private String nombre;
    private String carrera;
    private String grupo;
    private String semestre;
    private double promedio;

    public alumno() {
    }

    public alumno(String nombre, String carrera, String grupo, String semestre, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.grupo = grupo;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
