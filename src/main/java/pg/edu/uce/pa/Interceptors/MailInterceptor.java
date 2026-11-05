package pg.edu.uce.pa.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import pg.edu.uce.pa.Pedido;

@Mail 
@Interceptor 
@Priority ((Interceptor.Priority.APPLICATION+0))
public class MailInterceptor {

    @AroundInvoke 
    public Object interceptar (InvocationContext context) throws Exception{
        Object[] valores = context.getParameters();

        Pedido pedido = (Pedido) valores[0];
        Object resultado = context.proceed();

        System.out.println("[Mail interceptor] " +" Enviando Mail de notificación a  " + pedido.getCorreo());

        return resultado;
    }
}
