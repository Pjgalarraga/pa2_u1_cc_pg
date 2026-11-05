package pg.edu.uce.pa.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority((Interceptor.Priority.APPLICATION+3))
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {

        Long init = System.currentTimeMillis();
        Object resultado = context.proceed();
        Long fin = System.currentTimeMillis();

        System.out.println("[Interceptor medir tiempo] El metodo demoro: " + (fin - init));
        return resultado;
    }

}
