package pg.edu.uce.pa.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import pg.edu.uce.pa.Pedido;

@SMS 
@Interceptor 
@Priority ((Interceptor.Priority.APPLICATION+1))
public class SMSInterceptor {

    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception{

        Object resultado = context.proceed();

        Object valores[] = context.getParameters();
        Pedido pedido = (Pedido) valores[0];

        System.out.println("[SMS interceptor]" + " Enviando mensaje a " + pedido.getTelefono());
        return resultado;
        


    }
}
