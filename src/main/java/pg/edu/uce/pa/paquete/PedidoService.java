package pg.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import pg.edu.uce.pa.MailService;
import pg.edu.uce.pa.Notificacion;
import pg.edu.uce.pa.Pedido;
import pg.edu.uce.pa.SMSService;
import pg.edu.uce.pa.Interceptors.Auditoria;

@ApplicationScoped // Delego el control al contenedor ArC
// @RequestScoped //Aplicaciones web
// @Singleton //funcionalidad que no es lógica del negocio
public class PedidoService {

    @Auditoria 
    public String realizar(Pedido pedido, String valor) {

        System.out.println("realizando pedido...");

        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());

        System.out.println("Pedido realizado con éxito.");

        String cuerpo = "Estimado " + pedido.getCliente() + ", su pedido de " + pedido.getProducto() +
                " por un total de $" + pedido.getTotal() + " ha sido realizado con éxito";

                return "Pedido realizado con éxito";
    

    }

}
