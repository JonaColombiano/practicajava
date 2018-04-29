
package Empleado;

/**
 *
 * @author Aspire 5
 */
public class usoEmpleado {


    public static void main(String[] args) {
     Empleado[] empleado=new Empleado[4];
     empleado[0]=new Empleado("Jose", 1500,2012,01,02);
     empleado[1]=new Empleado("Maria", 1500,2012,06,15);
     empleado[2]=new Empleado("Ivan", 1500,2013,05,07);
     empleado[3]=new Empleado("Juan");//Se llama al segundo constructor que solo recibe un parametro
     
     for(Empleado e: empleado){
         e.SubeSueldo(5);
     }
     
     for(Empleado x: empleado){
         System.out.println(x.obtenerNombre()+" "+ x.obtenerSueldo()+" "+x.obtenerFechaContrato());
     }
    }
    
    
}
