package pg.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import pg.edu.uce.pa.MailService;
import pg.edu.uce.pa.Pedido;

@ApplicationScoped // Delego el control al contenedor ArC
// @RequestScoped //Aplicaciones web
// @Singleton //funcionalidad que no es lógica del negocio
public class PedidoService {

    // inyección de dependencias mediante atributo
    
    /*   @Inject
      private MailService mailService;
     */

    // inyección de dependencias mediante constructor
   /*private MailService mailService;

    @Inject
    public PedidoService(MailService mailService) {
        this.mailService = mailService;

    }*/




    // inyección de dependencias mediante método
    private MailService mailService;

    @Inject 
    public void setMailService(MailService mailService) {
    System.out.println("Se está inyectando el servicio de correo electrónico en PedidoService");
    this.mailService = mailService;


}


    public void realizar(Pedido pedido) {

        System.out.println("realizando pedido...");

        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());

        System.out.println("Pedido realizado con éxito.");

        String asunto = "Confirmación de pedido";
        String cuerpo = "Estimado " + pedido.getCliente() + ", su pedido de " + pedido.getProducto() +
                " por un total de $" + pedido.getTotal() + " ha sido realizado con éxito";

        this.mailService.enviar(pedido.getCorreo(), asunto, cuerpo);

    }
}
