import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Pasajero> pasajeros =
                new HashMap<>();

        pasajeros.put(1, new Pasajero(
                "Juan Perez",
                "71234567",
                "Trujillo",
                "15/06/2026",
                "08:00",
                1));

        pasajeros.put(2, new Pasajero(
                "Maria Lopez",
                "72345678",
                "Chiclayo",
                "15/06/2026",
                "08:00",
                2));

        pasajeros.put(3, new Pasajero(
                "Carlos Gomez",
                "73456789",
                "Piura",
                "15/06/2026",
                "08:00",
                3));

        pasajeros.put(4, new Pasajero(
                "Ana Torres",
                "74567890",
                "Lima",
                "15/06/2026",
                "08:00",
                4));

        int asientoBuscado = 3;
        boolean encontrado = false;

        System.out.println("---------------------------------");
        System.out.println("RESULTADO DE LA BUSQUEDA");
        System.out.println("---------------------------------");

        Iterator<Map.Entry<Integer, Pasajero>> iterator =
                pasajeros.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Integer, Pasajero> entry =
                    iterator.next();

            Pasajero pasajero = entry.getValue();


            if (pasajero.getAsiento() == asientoBuscado) {

                System.out.println("PASAJERO ENCONTRADO");
                System.out.println(pasajero);

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println(
                    "No existe pasajero en el asiento "
                            + asientoBuscado
            );
        }


    }
}
