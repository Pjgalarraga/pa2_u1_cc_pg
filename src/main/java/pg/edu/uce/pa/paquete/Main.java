package pg.edu.uce.pa.paquete;

import pg.edu.uce.pa.paquete.entidad.Calificacion;
import pg.edu.uce.pa.paquete.entidad.CalificacionService;

public class Main {

    public static void main(String[] args) {
        
        Calificacion calificacion1 = new Calificacion("Juan Carlos", "Tarea 1", "JC@example.com", 18.00);

        CalificacionService cs = new CalificacionService();
        cs.calificar(calificacion1);

        calificacion1 = null;
        cs = null;

        



    }

}
