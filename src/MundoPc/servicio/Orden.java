package MundoPc.servicio;

import java.util.ArrayList;
import java.util.List;
import MundoPc.modelo.Computadora;

public class Orden {
    private final int idOrden;
    private final List<Computadora> computadoras;
    private static int contadorOrd;


    public Orden(){
        computadoras = new ArrayList<>();
        this.idOrden = ++contadorOrd;
    }


    public void agregarComputadora(Computadora computadora){
        computadoras.add(computadora);
    }

    public void mostrarOrden() {
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total computadoras: " + computadoras.size());
        System.out.println();
        computadoras.forEach(System.out::println);
    }

}
