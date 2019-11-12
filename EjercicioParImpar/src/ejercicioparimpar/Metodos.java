package ejercicioparimpar;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos {
private int num;
Scanner sc = new Scanner(System.in);

public void pedirDatos(){
    System.out.println("Introduce un numero");
num=sc.nextInt();
}
public void verDatos(){
int contador=0,acumulador=0;
while (contador<10){
pedirDatos();
if (num%2==0)
acumulador=acumulador+num;    
else {
acumulador=acumulador*num;
}
contador++;    
}
System.out.println(acumulador);
}
}
