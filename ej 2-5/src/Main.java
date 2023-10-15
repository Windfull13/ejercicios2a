import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int altura1 = 0;
        int altura2 = 0;
        int altura3 = 0;
        int orden1 = 0;
        int orden2 = 0;
        int orden3 = 0;
        screen.println("Ingrese la primer altura en cm: ");
        altura1=keyboard.nextInt();
        screen.println("Ingrese la segunda altura en cm: ");
        altura2=keyboard.nextInt();
        screen.println("Ingrese la tercera altura en cm: ");
        altura3=keyboard.nextInt();
        if (altura1>=altura2 & altura1>=altura3){orden3=altura1;}
        if (altura2>=altura1 & altura2>=altura3){orden3=altura2;}
        if (altura3>=altura1 & altura3>=altura2){orden3=altura3;}
        if (altura1<=altura2 & altura1<=altura3){orden1=altura1;}
        if (altura2<=altura1 & altura2<=altura3){orden1=altura2;}
        if (altura3<=altura1 & altura3<=altura1){orden1=altura3;}
        if (altura1<=altura3 & altura1>=altura2){orden2=altura1;}
        if (altura2<=altura1 & altura2>=altura3){orden2=altura2;}
        if (altura3<=altura2 & altura3<=altura1){orden2=altura3;}
        else{;
        screen.println("El orden ascendente de las alturas mencionadas es : " +orden1+" cm, " +orden2+ " cm y " +orden3+" cm");
        }
    }
}
