package MundoPc;
import MundoPc.modelo.Raton;
import MundoPc.modelo.Teclado;
import MundoPc.modelo.Monitor;
import MundoPc.modelo.Computadora;
import MundoPc.servicio.Orden;;

public class VentasComputadora {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        Teclado tecladoLogitech = new Teclado("Bluetooth", "Logitech");
        Monitor monitorAsus = new Monitor("Asus", 27);
        Computadora asusComputer = new Computadora("Asus", monitorAsus, tecladoLogitech, ratonLenovo);
        //Creamos una orden

        MundoPc.servicio.Orden orden1 = new Orden();
        orden1.agregarComputadora(asusComputer);
        orden1.mostrarOrden();


        System.out.println(ratonLenovo);
        System.out.println(tecladoLogitech);
        System.out.println(monitorAsus);
        System.out.println(asusComputer);
    }
}
