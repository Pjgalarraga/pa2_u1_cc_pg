package pg.edu.uce.pa.paquete.entidad;

public class CalificacionService {

    public void calificar(Calificacion c){

        System.out.println("Calificando...");

        System.out.println("Calificando: "+ c.getEvaluacion() );
        System.out.println("Estudiante: " + c.getNombreEstudiante());
        System.out.println("Nota: " + c.getNota());
        System.out.println("Correo estudiante: " + c.getCorreoEstudiante());

        System.out.println("Enviando correo...");

 MailService mailService = new MailService();

        String asunto = "Confirmación de calificación";
        String cuerpo = "Estudiante: " + c.getNombreEstudiante() + ", se ha realizado la calificación de " + c.getEvaluacion() +
        ", NOTA: " + c.getNota();

        mailService.enviar(c.getCorreoEstudiante(), asunto, cuerpo);
        mailService = null;

    }

}
