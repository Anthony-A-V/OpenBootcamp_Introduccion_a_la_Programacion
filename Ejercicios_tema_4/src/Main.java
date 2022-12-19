public class Main {
    public static void main(String[] args) {

        var numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf == 0) {
            System.out.println("Es cero");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        }

        var numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        var numeroFor = 0;

        for (int i = 0; i <= 3; i++) {
            numeroFor++;
            System.out.println(numeroFor);
        }

        var estacion = "Primavera";

        switch (estacion) {
            case "Verano":
                System.out.println("Verano");
                break;
            case "Primavera":
                System.out.println("Primavera");
                break;
            case "Otoño":
                System.out.println("Otoño");
                break;
            case "Invierno":
                System.out.println("Invierno");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}

