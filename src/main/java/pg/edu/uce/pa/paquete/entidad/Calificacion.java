package pg.edu.uce.pa.paquete.entidad;


public class Calificacion {

    private String nombreEstudiante;
    private String evaluacion;
    private String correoEstudiante;
    private double nota;

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public Calificacion(){

    }

    public Calificacion(String nombreEstudiante, String evaluacion, String correoEstudiante, double nota) {
        this.nombreEstudiante = nombreEstudiante;
        this.evaluacion = evaluacion;
        this.correoEstudiante = correoEstudiante;
        this.nota = nota;
    }


    

}
