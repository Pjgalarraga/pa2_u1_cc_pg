package pg.edu.uce.pa;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import pg.edu.uce.pa.extensiones.NotificacionExtensionMail;
import pg.edu.uce.pa.extensiones.NotificacionExtensionSMS;
import pg.edu.uce.pa.extensiones.NotificacionExtensionWhatsApp;
import pg.edu.uce.pa.paquete.PedidoService;

@QuarkusMain
public class Main implements QuarkusApplication {

   @Inject
   private CompraService compraService;

   @Inject
   NotificacionExtensionMail notificacionExtensionMail;

   @Inject
   NotificacionExtensionSMS notificacionExtensionSMS;

   @Inject
   NotificacionExtensionWhatsApp notificacionExtensionWA;

   public static void main(String[] args) {

      Quarkus.run(Main.class, args);

   }

   @Override
   public int run(String... args) {
      System.out.println("Iniciando aplicación Quarkus");

      // Creamos manualmente el objeto de la clase pedido
      Pedido pedido = new Pedido("Juan Pérez", "Laptop", "juan.perez@example.com", 1500.00, "0991677893");
      Compra compra = new Compra("Luis", "Laptop", "luis@example", 1200.00, "09991313");

      compraService.realizar(compra, this.notificacionExtensionMail);

      Compra compra2 = new Compra("Juan", "Laptop", "juan@example", 1200.00, "09991313");

      compraService.realizar(compra2, this.notificacionExtensionSMS);

        Compra compra3 = new Compra("Daniel", "Laptop", "daniel@example", 1200.00, "09991313");

      compraService.realizar(compra3, this.notificacionExtensionWA);

      return 0;
   }

}
