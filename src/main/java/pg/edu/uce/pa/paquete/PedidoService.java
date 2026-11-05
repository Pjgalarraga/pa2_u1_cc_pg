package pg.edu.uce.pa.paquete;

import java.sql.Time;
import java.time.LocalDateTime;

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
import pg.edu.uce.pa.Interceptors.Mail;
import pg.edu.uce.pa.Interceptors.MedirTiempo;
import pg.edu.uce.pa.Interceptors.SMS;

@ApplicationScoped // Delego el control al contenedor ArC
// @RequestScoped //Aplicaciones web
// @Singleton //funcionalidad que no es lógica del negocio
public class PedidoService {
    @MedirTiempo 
    @Auditoria
    @SMS 
    @Mail 
   
    public String realizar(Pedido pedido, String valor) {

       
        try {
            Thread.sleep(1500);
        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println("realizando pedido...");

        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());

        System.out.println("Pedido realizado con éxito.");

        

        return "Pedido realizado con éxito";

    }

}
