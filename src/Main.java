public class Main {
    public static void main(String[] args) {

        int numeroIf = 0;

        if( numeroIf > 0) {
        System.out.println( "If: El numero es positivo" );
        } else if( numeroIf < 0) {
            System.out.println( "If: El numero es negativo" );
        } else {
            System.out.println( "If: El numero es cero" );
        }

        int numeroWhile = 0;

        while( numeroWhile < 3 ) {
            System.out.println("while: " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        int numeroDoWhile = 3;

        do{
            System.out.println("do-while: " + numeroWhile);
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile < 3);

        int numeroFor;

        for( numeroFor= 0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor es :" + numeroFor);
        }
        
        String estacion = "Invierno";

        switch (estacion) {
            case "Otoño":
                System.out.println("Estamos en " + estacion);
                break;
            case "Invierno":
                System.out.println("Estamos en " + estacion);
                break;
            case "Primavera":
                System.out.println("Estamos en " + estacion);
                break;
            default:
                estacion = "Verano";
                System.out.println("Estamos en " + estacion);
        }
    }
}