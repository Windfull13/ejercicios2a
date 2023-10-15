import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int dia;
        int mes;
        screen.println("Ingrese el dia en el que usted nacio");
        dia= keyboard.nextInt();
        screen.println("Ingrese el numero del mes al que usted nacio");
        mes= keyboard.nextInt();
        switch (mes) {
            case 1:
                //Enero
                if (dia >= 21)
                    System.out.println("Su signo es acuario");
                else
                    System.out.println("Su signo es capricornio");
                break;
            case 2:
                // Febrero
                if (dia >= 20)
                    System.out.println("Su signo es piscis");
                else
                    System.out.println("Su signo es acuario");
                break;
            case 3:
                // Marzo
                if (dia >= 21)
                    System.out.println("Su signo es aries");
                else
                    System.out.println("Su signo es piscis");
                break;
            case 4:
                // Abril
                if (dia >= 20)
                    System.out.println("Su signo es tauro");
                else
                    System.out.println("Su signo es aries");
                break;
            case 5:
                // Mayo
                if (dia >= 21)
                    System.out.println("Su signo es geminis");
                else
                    System.out.println("Su signo es tauro");
                break;
            case 6:
                // Junio
                if (dia >= 21)
                    System.out.println("Su signo es cancer");
                else
                    System.out.println("Su signo es geminis");
                break;
            case 7:
                // Julio
                if (dia >= 23)
                    System.out.println("Su signo es leo");
                else
                    System.out.println("Su signo es cancer");
                break;
            case 8:
                // Agosto
                if (dia >= 23)
                    System.out.println("Su signo es virgo");
                else
                    System.out.println("Su signo es leo");
                break;
            case 9:
                // Septiembre
                if (dia >= 23)
                    System.out.println("Su signo es libra");
                else
                    System.out.println("Su signo es virgo");
                break;
            case 10:
                // Octubre
                if (dia >= 23)
                    System.out.println("Su signo es escorpio");
                else
                    System.out.println("Su signo es libra");
                break;
            case 11:
                // Noviembre
                if (dia >= 22)
                    System.out.println("Su signo es sagitario");
                else
                    System.out.println("Su signo es escorpio");
                break;
            case 12:
                // Diciembre
                if (dia >= 22)
                    System.out.println("Su signo es capricornio");
                else
                    System.out.println("Su signo es sagitario");
                break;
        }
    }
}