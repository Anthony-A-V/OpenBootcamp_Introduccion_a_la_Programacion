public class Main {
    public static void main(String[] args) {
        suma(1, 2, 3);
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas(1);
        System.out.println("Número de puertas: " + miCoche.getNumeroPuertas());
    }

    public static int suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        return resultado;
    }
}

