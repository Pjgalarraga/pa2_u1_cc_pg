package pg.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import pg.edu.uce.pa.paquete.entidad.Calificacion;
import pg.edu.uce.pa.paquete.entidad.CalificacionService;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private CalificacionService cs;

    public static void main(String[] args) {

        Quarkus.run(Main.class, args);

    }

    @Override
    public int run(String... args) {

        System.out.println("Iniciando aplicación Quarkus");
        Calificacion calificacion1 = new Calificacion("Juan Carlos", "Tarea 1", "JC@example.com", 18.00);

        cs.calificar(calificacion1);

        return 0;
    }

}
