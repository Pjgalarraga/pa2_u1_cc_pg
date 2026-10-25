package pg.edu.uce.pa;

import jakarta.inject.Named;
import pg.edu.uce.pa.paquete.CalculadoraDescuento;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
@Named("regular")
public class DescuentoRegular implements CalculadoraDescuento {

    @Override
    public double Calcular(double monto) {
       double descuento = monto *0.05;
       return descuento;


    }

}
