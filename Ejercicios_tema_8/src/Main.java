public class Main
{
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setNombre("Anthony");
        persona.setTelefono(983505256);
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}