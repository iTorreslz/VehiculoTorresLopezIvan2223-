package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {

    public static void main(String[] args) {
        VehiculoTorresLopezIvan2223 miVehiculoTorresLopezIvan2223;
        int stockActual;

        miVehiculoTorresLopezIvan2223 = new VehiculoTorresLopezIvan2223("Seat", 18000, 100);
        operativaVehiculosTorresLopezIvan2223(miVehiculoTorresLopezIvan2223, 50);
    }

    private static void operativaVehiculosTorresLopezIvan2223(VehiculoTorresLopezIvan2223 miVehiculoTorresLopezIvan2223,
            int cantidad) {
        int stockActual;
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoTorresLopezIvan2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }
        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoTorresLopezIvan2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoTorresLopezIvan2223.obtenerStock();
        System.out.println("El stock actual es" + stockActual);
    }

}
