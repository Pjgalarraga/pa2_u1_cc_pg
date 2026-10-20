package pg.edu.uce.pa;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import pg.edu.uce.pa.paquete.PedidoService;

@QuarkusMain 
public class Main implements QuarkusApplication{

   @Inject 
    private PedidoService pedidoService;

    public static void main(String[] args) {
        
     Quarkus.run(Main.class, args);




    }

    @Override
    public int run(String... args)  {
         System.out.println("Iniciando aplicación Quarkus");

           //Creamos manualmente el objeto de la clase pedido
        Pedido pedido = new Pedido("Juan Pérez", "Laptop", "juan.perez@example.com", 1500.00);
        
        pedidoService.realizar(pedido);
     

      
        return 0;
         }


}
