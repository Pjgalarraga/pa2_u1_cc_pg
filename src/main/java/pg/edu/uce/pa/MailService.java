package pg.edu.uce.pa;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

//Ambitos y contextos
//@ApplicationScoped // su ambito es durante toda la aplicación, es decir, se crea una sola instancia
//de la clase y se comparte entre todos los componentes que la utilizan


//@RequestScoped  //Su ambito es en aplicaciones web, durante el request o petición http
//es decir, se crea una instancia de la clase y se comparte entre todos los componentes 


//@SessionScoped // su ambito es en aplicaciones web durante la sesión de usuario


//@Singleton// su ambito es durante toda la aplicación, es decir, se crea una sola instancia
//de la clase y se comparte entre todos los componentes que la utilizan


@Dependent  // su ambito es durante la inyección de dependencias, se crea una instancia y se comparte
//entre todos los componentes que la utilizan durante la inyección de dependencias.
//Cada vez que se inyecte se creará un nuevo objeto




@Named ("mail")
public class MailService implements Notificacion {

    private Integer cantidad=0;
    private String nombre;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void enviar(String destino, String mensaje) {
       System.out.println("Enviando correo a: " + destino);
       System.out.println("Mensaje: " + mensaje);
       System.out.println("Correo enviado con éxito.");
       System.out.println("Fin del envío de correo.");


    }
}
