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

    @Inject 
    private CompraService compraService;

    public static void main(String[] args) {
        
     Quarkus.run(Main.class, args);




    }

    @Override
    public int run(String... args)  {
         System.out.println("Iniciando aplicación Quarkus");

           //Creamos manualmente el objeto de la clase pedido
        Pedido pedido = new Pedido("Juan Pérez", "Laptop", "juan.perez@example.com", 1500.00, "0991677893");
        
        pedidoService.realizar(pedido);


        Compra compra = new Compra("Pedro Galárraga", "smartphone",  "pg@example.com", 800.00, "0991458943");
        this.compraService.realizar(compra);


        
     

      
        return 0;
         }


}
