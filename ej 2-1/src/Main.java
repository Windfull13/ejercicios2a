import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static PrintStream screen= System.out;
    public static Scanner keyboard= new Scanner(System.in);

    public static void main(String[] args) {
        String mensaje="";
        int num=0;
        int res=0;
        screen.println("Ingrese un numero entero");
        num=keyboard.nextInt();
        res=num%2;
        if (res==0){
            mensaje="El numero ingresado es par";
        }
        else{
            mensaje="El numero ingresado es impar";
        }
        screen.println(mensaje);
    }
}