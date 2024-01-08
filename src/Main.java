import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cuantas contraseñas quieres?");
        Scanner sc = new Scanner(System.in);

        Password[] contrasenyas = new Password[sc.nextInt()];
        System.out.println("De que longitud quieres las contraseñas?");
        int longitud = sc.nextInt();
        for (int i = 0; i < contrasenyas.length; i++) {


            contrasenyas[i] = new Password(longitud);

        }

        Boolean[] fuertes = new Boolean[contrasenyas.length];
        for (int i = 0; i<fuertes.length; i++){
            fuertes[i] = contrasenyas[i].esFuerte();
            System.out.println(fuertes[i] + " -> " + contrasenyas[i].getContrasenya());
        }
    }
}