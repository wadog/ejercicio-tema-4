public class Main {
    public static void main(String[] args) {
        //if - else-if
        int numeroIf = 7;
        if (numeroIf > 0) {
            System.out.println(numeroIf + " es positivo");
        }else if(numeroIf < 0){
            System.out.println(numeroIf + " es negativo");
        }else {
                System.out.println(numeroIf);
        }
        //while
        int numeroWhile = 0;
        while(numeroWhile < 3) {
            System.out.println(numeroWhile + " while");
            numeroWhile++;
        }
        //do while
        int numeroDoWhile = 0;
        do {
            System.out.println(numeroDoWhile + " do while");
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
        //for
        for(int numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println(numeroFor + " bucle for");
        }
        //switch
        String estacion = "primavera";
        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("elige una etacion del año");
        }
    }
}