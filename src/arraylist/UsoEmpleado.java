package arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {
    public static void main(String[] args) {
/*

        Empleado[] listaEmpleados = new Empleado[3];

        listaEmpleados[0] = new Empleado("Ana Maria", 32, 1200);
        listaEmpleados[1] = new Empleado("Juan Alberto", 31, 1600);
        listaEmpleados[2] = new Empleado("Jose Maria", 42, 1500);

*/
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();

        // Almacenar datos a traves de un arraylist
        //listaEmpleados.ensureCapacity(11);      // Defines el nº de elementos a reservar

        listaEmpleados.add(new Empleado("Pedro Jose", 43, 2000));
        listaEmpleados.add(new Empleado("Andrea Paola", 21, 1290));
        listaEmpleados.add(new Empleado("Jose Maria", 42, 1500));
        listaEmpleados.add(new Empleado("Angela Sanchez", 25, 1100));
        listaEmpleados.add(new Empleado("Antonio Contreras", 53, 3000));

        // Añadir otro usuario definiendo la posicion donde deseamos incluir
        //listaEmpleados.set(0, new Empleado("Luz Maria", 49, 4000));

        System.out.println(listaEmpleados.size());

        //listaEmpleados.trimToSize();    // corta el exceso de memoria, si estas seguro de los valores definidos, se puede seguir agregando elementos pero se sigue consumiendo memoria

        for (Empleado e : listaEmpleados)
            System.out.println(e);

        // Mostrar un elemento de una posicion especifica
        //System.out.println("El empleado de la posicion 3 : " + listaEmpleados.get(2));

        System.out.println("===============================================");

        for (int i=0; i<listaEmpleados.size(); i++) {
            Empleado e = listaEmpleados.get(i);
            System.out.println(e);
        }

        System.out.println("===============================================");

        // Metodo Iterador

        Iterator <Empleado> mi_iterador = listaEmpleados.iterator();    // Instanciar un iterador de la lista del objeto empleado

        while (mi_iterador.hasNext())             // hasNext() devuelve un boolean, si hay o no elementos existentes en el iterador
            System.out.println(mi_iterador.next()); // next() retorna el siguiente elemento de la secuencia


    }
}
