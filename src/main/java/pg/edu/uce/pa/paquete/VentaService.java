package pg.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import pg.edu.uce.pa.DescuentoRegular;

@ApplicationScoped 
public class VentaService {

    @Inject 
    @Named("regular")
  CalculadoraDescuento descuentoRegular;

  private CalculadoraDescuento descuentoVIP;

  @Inject
    public VentaService(@Named("vip") CalculadoraDescuento descuentoVIP) {
        this.descuentoVIP = descuentoVIP;
    }

    @Inject 
    Auditoria auditoria;

    public void procesarVenta(String tipo, double monto) {
        double descuento;
        if (tipo.equalsIgnoreCase("VIP")) {
            descuento = descuentoVIP.Calcular(monto);
        } 
        else if(tipo.equalsIgnoreCase("regular")){
              descuento = descuentoRegular.Calcular(monto);
        }else {
          System.out.println("Tipo de venta no encontrado");
          descuento=0.0;
        }
        double total = monto - descuento;

        auditoria.registrar(tipo, monto, descuento, total);
    }





    

}
