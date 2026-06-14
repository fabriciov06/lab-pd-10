import java.util.HashMap;

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
    }
}
