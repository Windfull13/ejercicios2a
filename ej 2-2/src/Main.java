import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static PrintStream screen= System.out;
    public static Scanner keyboard= new Scanner(System.in);

    public static void main(String[] args) {
        String mensaje="";
        int num;
        screen.println("Ingrese un numero entero");
        num=keyboard.nextInt();
        if (num>0){
            mensaje="El numero ingresado es positivo";
        }
        else if(num==0){
            mensaje="El numero ingresado es cero";
        }
        else{
            mensaje="El numero ingresado es negativo";
        }
        screen.println(mensaje);
    }
}