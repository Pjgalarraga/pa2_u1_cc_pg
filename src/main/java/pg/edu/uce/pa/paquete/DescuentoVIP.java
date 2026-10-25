package pg.edu.uce.pa.paquete;

import jakarta.inject.Named;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
@Named("vip")
public class DescuentoVIP implements CalculadoraDescuento {

    @Override
    public double Calcular(double monto) {
       double descuento = monto *0.15;
       return descuento;


    }
}
