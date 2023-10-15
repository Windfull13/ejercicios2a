import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String mensaje="";
        int cosllan=120000;
        int cosllan2=108000;
        int costotllan;
        int cantllan;
        screen.println("Ingrese la cantidad de llantas que usted necesita");
        cantllan= keyboard.nextInt();
        if (cantllan<4) {
            costotllan=cosllan*cantllan;
            mensaje="La cantidad que debe pagar es:" +costotllan;
        }
        else{
            costotllan=cosllan2*cantllan;
            mensaje="La cantidad que debe pagar es:" +costotllan;
        }
        screen.println(mensaje);
    }
}