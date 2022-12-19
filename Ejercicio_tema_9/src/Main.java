public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Anthony");
        cliente.setEdad(25);
        cliente.setTelefono(983505256);
        cliente.setCredito(5);
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito() + "%");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Piero");
        trabajador.setEdad(23);
        trabajador.setTelefono(982154624);
        trabajador.setSalario(1000);
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}