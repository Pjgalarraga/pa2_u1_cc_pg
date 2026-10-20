package pg.edu.uce.pa.paquete.entidad;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped 
public class CalificacionService {

    @Inject 
    private MailService mailService;

    public void calificar(Calificacion c){

        System.out.println("Calificando...");

        System.out.println("Calificando: "+ c.getEvaluacion() );
        System.out.println("Estudiante: " + c.getNombreEstudiante());
        System.out.println("Nota: " + c.getNota());
        System.out.println("Correo estudiante: " + c.getCorreoEstudiante());

        System.out.println("Enviando correo...");



        String asunto = "Confirmación de calificación";
        String cuerpo = "Estudiante: " + c.getNombreEstudiante() + ", se ha realizado la calificación de " + c.getEvaluacion() +
        ", NOTA: " + c.getNota();

        mailService.enviar(c.getCorreoEstudiante(), asunto, cuerpo);
    

    }

}
