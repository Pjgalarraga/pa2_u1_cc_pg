package pg.edu.uce.pa;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import pg.edu.uce.pa.extensiones.NotificacionExtension;

@ApplicationScoped 
public class CompraService {
//mediante constructor, parámetro en el método, componente externo se manda la implementación
    public void realizar(Compra compra, NotificacionExtension notificacionExtension) {

        System.out.println("realizando compra...");

        System.out.println("Compra realizado para el cliente: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: " + compra.getTotal());
        System.out.println("Correo: " + compra.getCorreo());

        System.out.println("Compra realizado con éxito.");

        //aquí programo el envío de la notificación

        notificacionExtension.enviar("Su pedido ha sido realizado con éxito",
         compra.getCliente());

         


      
    }

}
