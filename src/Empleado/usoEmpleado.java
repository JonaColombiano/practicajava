
package Empleado;

/**
 *
 * @author Aspire 5
 */
public class usoEmpleado {


    public static void main(String[] args) {
     Jefatura jefeRH=new Jefatura("Susan", 10000,2012,01,07);
     jefeRH.establecerIncentivo(5);
     Empleado[] empleado=new Empleado[6];
     empleado[0]=new Empleado("Jose", 1500,2012,01,02);
     empleado[1]=new Empleado("Maria", 1500,2012,06,15);
     empleado[2]=new Empleado("Ivan", 1500,2013,05,07);
     empleado[3]=new Empleado("Juan");//Se llama al segundo constructor que solo recibe un parametro
     empleado[4]=jefeRH;              //Polimorfismo en accion. Principio de sustitucion
     empleado[5]=new Jefatura ("Susan", 10000,2012,01,07);
     //la clase que hereda toma las variables objeto del padre como si fueran suyas
     //En eso consiste el polimorfismo

     
     for(Empleado e: empleado){
         e.SubeSueldo(5);
     }
     
     for(Empleado x: empleado){
         System.out.println(x.obtenerNombre()+" "+
                 x.obtenerSueldo()+" "+    //Enlazado Dinamico: la Maquina virtual detecta el metodo correspondiete
                                           //y utiliza el metodo que sobrescribimos solo con la clase heredada
                 x.obtenerFechaContrato());
     }
    }
    
    
}
