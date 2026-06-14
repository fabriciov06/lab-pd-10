public class Pasajero {
    private String nombre;
    private int dni;
    private String destino;
    private String fecha;
    private String hora;
    private int asiento;

    public Pasajero(String nombre, int dni, String destino,
                    String fecha, String hora, int asiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.asiento = asiento;
    }
}
