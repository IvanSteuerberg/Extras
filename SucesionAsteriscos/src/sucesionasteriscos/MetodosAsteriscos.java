package sucesionasteriscos;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class MetodosAsteriscos {
private String asterisco="*";
private int numElem;
Scanner sc = new Scanner(System.in);    

public void pedirDatos(){
System.out.println("Introduce o numero de filas que queres");
numElem=sc.nextInt();
}

public void sucesion(){
int cont;
String acumulador="";
pedirDatos();
for (cont=0;cont<numElem;cont++){
acumulador=acumulador+asterisco;
System.out.println(acumulador);
}
    
}



}
