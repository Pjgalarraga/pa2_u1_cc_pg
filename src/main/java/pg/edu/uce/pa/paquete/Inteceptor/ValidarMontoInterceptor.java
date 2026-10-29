package pg.edu.uce.pa.paquete.Inteceptor;

import java.lang.reflect.Parameter;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@ValidarMonto
@Interceptor
public class ValidarMontoInterceptor {

    @AroundInvoke
    public Object validarYRegistrar(InvocationContext context) throws Exception {
      /* String nombreMetodo = context.getMethod().getName();
        System.out.println("[ValidarMonto]: se está ejecutando el método: " + nombreMetodo);*/  

         /* Parameter[] parametros = context.getMethod().getParameters();
            for (Parameter parameter : parametros) {
            System.out.println("Parámetro: " + parameter.getName());

        }*/

        Object[] valores = context.getParameters();

        double monto = (Double) valores[1];

        if(monto <= 0){
            System.out.println("[ValidarMonto]: El monto no puede ser 0 o menor a 0: " + monto);
                System.out.println("--------------------------------------------------------------------");
            return null;
        }else{
            System.out.println("[ValidarMonto] Validación previa aprobada. Iniciando proceso...");

         Object resultado = context.proceed(); // ejecuta el método interceptado
         System.out.println("--------------------------------------------------------------------");

        return resultado;
        }

    }

}
