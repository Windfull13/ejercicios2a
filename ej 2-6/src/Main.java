import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int altura1 = 0;
        int altura2 = 0;
        int altura3 = 0;
        int altura4 = 0;
        int orden1 = 0;
        int orden2 = 0;
        int orden3 = 0;
        int orden4 = 0;
        screen.println("Ingrese la primera altura en cm: ");
        altura1=keyboard.nextInt();
        screen.println("Ingrese la segunda altura en cm: ");
        altura2=keyboard.nextInt();
        screen.println("Ingrese la tercera altura en cm: ");
        altura3=keyboard.nextInt();
        screen.println("Ingrese la cuarta altura: ");
        altura4=keyboard.nextInt();
        if (altura1>=altura2 & altura1>=altura2 & altura1>=altura3){
            orden4=altura1;
        }
        else if (altura2>=altura1 & altura2>=altura3 & altura2>=altura4){
            orden4=altura2;
        }
        else if (altura3>=altura1 & altura3>=altura2 & altura3>=altura4){
            orden4=altura3;
        }
        else if (altura4>=altura1 & altura4>=altura2 & altura4>=altura3){
            orden4=altura4;
        }
        if (altura1<=altura2 & altura1<=altura3 & altura1<=altura4){
            orden1=altura1;
        }
        else if (altura2<=altura1 & altura2<=altura3 & altura2<=altura4){
            orden1=altura2;
        }
        else if (altura3<=altura1 & altura3<=altura2 & altura3<=altura4){
            orden1=altura3;
        }
        else if (altura4<=altura1 & altura4<=altura2 & altura4<=altura3){
            orden1=altura4;
        }
        if (altura1<=altura4 & altura1>=altura3 & altura1>=altura2){
            orden3=altura1;
        }
        else if (altura1<=altura3 & altura1>=altura4 & altura1>=altura2){
            orden3=altura1;
        }
        else if (altura1<=altura2 & altura1>=altura4 & altura1>=altura3){
            orden3=altura1;
        }
        if (altura2<=altura4 & altura2>=altura3 & altura2>=altura1){
            orden3=altura2;
        }
        else if (altura2<=altura3 & altura2>=altura4 & altura2>=altura1){
            orden3=altura2;
        }
        else if (altura2<=altura1 & altura2>=altura4 & altura2>=altura3){
            orden3=altura2;
        }
        if (altura3<=altura4 & altura3>=altura2 & altura3>=altura1){
            orden3=altura3;
        }
        else if (altura3<=altura2 & altura3>=altura4 & altura3>=altura1){
            orden3=altura3;
        }
        else if (altura3<=altura1 & altura3>=altura4 & altura3>=altura2){
            orden3=altura3;
        }
        if (altura4<=altura3 & altura4>=altura2 & altura4>=altura1){
            orden3=altura4;
        }
        else if (altura4<=altura2 & altura4>=altura3 & altura4>=altura1){
            orden3=altura4;
        }
        else if (altura4<=altura1 & altura4>=altura3 & altura4>=altura2){
            orden3=altura4;
        }
        if (altura1>=altura4 & altura1<=altura3 & altura1<=altura2){
            orden2=altura1;
        }
        else if (altura1>=altura3 & altura1<=altura4 & altura1<=altura2){
            orden2=altura1;
        }
        else if (altura1>=altura2 & altura1<=altura4 & altura1<=altura3){
            orden2=altura1;
        }
        if (altura2>=altura4 & altura2<=altura3 & altura2<=altura1){
            orden2=altura2;
        }
        else if (altura2>=altura3 & altura2<=altura4 & altura2<=altura1){
            orden2=altura2;
        }
        else if (altura2>=altura1 & altura2<=altura4 & altura2<=altura3){
            orden2=altura2;
        }
        if (altura3>=altura4 & altura3<=altura2 & altura3<=altura1){
            orden2=altura3;
        }
        else if (altura3>=altura2 & altura3<=altura4 & altura3<=altura1){
            orden2=altura3;
        }
        else if (altura3>=altura1 & altura3<=altura4 & altura3<=altura2){
            orden2=altura3;
        }
        if (altura4>=altura3 & altura4<=altura2 & altura4<=altura1){
            orden2=altura4;
        }
        else if (altura4>=altura2 & altura4<=altura3 & altura4<=altura1){
            orden2=altura4;
        }
        else if (altura4>=altura1 & altura4<=altura3 & altura4<=altura2){
            orden2=altura4;
        }
        screen.println("La altura de las personas que usted menciono en orden ascendente es: "+orden1+" cm, "+orden2+" cm, "+orden3+" cm y "+orden4+" cm");
    }
}