package pg.edu.uce.pa.paquete;

import java.util.UUID;

import jakarta.enterprise.context.Dependent;

@Dependent 
public class Auditoria {
private final String uuidInstance;



    public Auditoria() {
        this.uuidInstance = UUID.randomUUID().toString();
    
        System.out.println("[CICLO DE VIDA] Auditoria creada con UUID: " + this.uuidInstance);
    }

    public void registrar(String tipo, double monto, double descuento, double total) {
        System.out.println("-> [Auditoria ID: " + uuidInstance + "] Venta procesada [" + tipo 
                + "] | Monto: $" + monto + " | Descuento: $" + descuento + " | Total: $" + total);
    }

}
