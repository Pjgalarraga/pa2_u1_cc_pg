package pg.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    VentaService ventaService;

   

    public static void main(String[] args) {
        
     Quarkus.run(Main.class, args);




    }

    @Override
    public int run(String... args)  {
         System.out.println("Iniciando aplicación Quarkus");

         ventaService.procesarVenta("regular", 100);
         ventaService.procesarVenta("vip", -300.70);
         ventaService.procesarVenta("regular", 300);
         ventaService.procesarVenta("vip", 500);



        
     

      
        return 0;
         }


}