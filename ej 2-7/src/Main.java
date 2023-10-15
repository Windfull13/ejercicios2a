import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        long numtel = 0;
        long prefijo = 0;
        String operador = "";
        String tipope = "";
        String infraope = "";
        String preasig = "";

        screen.println("Ingrese un numero de telefono para hallar informacion relacionada a el");
        numtel = keyboard.nextLong();
        prefijo = numtel/10000000;
        if(prefijo>=300 & prefijo<=304){
            operador="Tigo";
        }
        else if(prefijo==324){
            operador="Tigo";
        }
        else if(prefijo>=310 & prefijo<=314){
            operador="Claro";
        }
        else if(prefijo>=320 & prefijo<=323){
            operador="Claro";
        }
        else if(prefijo>=315 & prefijo<=318){
            operador="Movistar";
        }
        else if(prefijo==319){
            operador="Virgin";
        }
        else if(prefijo>=350 & prefijo<=351){
            operador="Exito";
        }
        else if(prefijo>=305 & prefijo<=308){
            operador="Wom";
        }
        if(operador=="Claro"){
            tipope="Operador movil con red";
        }
        else if(operador=="Movistar"){
            tipope="Operador movil con red";
        }
        else if(operador=="Tigo"){
            tipope="Operador movil con red";
        }
        else if(operador=="Virgin"){
            tipope="Operador movil virtual";
        }
        else if(operador=="exito"){
            tipope="Operador movil virtual";
        }
        else{
            tipope="Operador Movil virtual";
        }
        if(operador=="Virgin"){
            infraope=" De Movistar.";
        }
        else if(operador=="Exito"){
            infraope=" De Tigo.";
        }
        else if(operador=="Wom"){
            infraope=" De Tigo, Claro y Movistar.";
        }
        else{
            infraope="Infraestructura propia.";
        }
        if(operador=="Claro"){
            preasig=" De 310 a 314 y 320 a 323";
        }
        else if(operador=="Tigo"){
            preasig=" De 300 a 304 y 324";
        }
        else if(operador=="Movistar"){
            preasig=" De 315 a 318";
        }
        else if(operador=="Virgin"){
            preasig=" Solo el 319";
        }
        else if(operador=="Exito"){
            preasig=" El 350 y el 351";
        }
        else{
            preasig=" Del 305 al 308";
        }
    }
}