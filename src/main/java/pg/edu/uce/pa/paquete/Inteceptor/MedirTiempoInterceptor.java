package pg.edu.uce.pa.paquete.Inteceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import jakarta.ws.rs.ext.InterceptorContext;

@MedirTiempo 
@Interceptor 
@Priority ((Interceptor.Priority.APPLICATION+1))
public class MedirTiempoInterceptor {

@AroundInvoke 
public Object realizar (InvocationContext context) throws Exception {

    System.out.println("[Medir Tiempo] empezando medición de tiempo");
    Long inicio = System.currentTimeMillis();

    Object resultado = context.proceed();

    Long fin = System.currentTimeMillis();
    Long tiempoTotal = fin-inicio;
    System.out.println("[Medir tiempo] tiempo total de ejecución: " + tiempoTotal);
    return resultado;

}

}
