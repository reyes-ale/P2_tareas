
package tarea2_recursivas_alejandrareyes;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Tarea2_Recursivas_AlejandraReyes {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner leerst = new Scanner (System.in);
        System.out.print(" * * * * * MENU * * * * *  \n 1. Decimal a Binario \n 2. Suma hasta \n 3. Factorial \n 4. MCD"
                + "\n 5. Numero invertido \n 6. Salir \n Ingrese una opcion: ");
        int opcion = leer.nextInt();
        
        while (opcion>0 && opcion<6){
                switch (opcion){
                    case 1:
                        System.out.print("Ingrese un numero positivo: ");
                        int nump = leer.nextInt();
                        while (nump < 0 ){
                            System.out.println("El numero debe ser positivo");
                            System.out.print("Ingrese el numero nuevamente: ");
                            nump=leer.nextInt();
                        }
                        System.out.println(nump + " convertido a binario es " + binario(nump));
                        break;

                    case 2:
                        System.out.print("Ingrese hasta que numero desea la suma: ");
                        int hasta = leer.nextInt();
                        while (hasta < 0 ){
                            System.out.println("El numero debe ser positivo");
                            System.out.print("Ingrese el numero nuevamente: ");
                            nump=leer.nextInt();
                        }
                        System.out.println("La suma de 0 a"
                                + " " + hasta + " es " + sumahasta(hasta,0));
                        break;

                    case 3:
                        System.out.print("Ingrese un numero para calcular su factorial: ");
                        int num = leer.nextInt();
                        System.out.println("El factorial de " + num + " es " + factorial(num,1));
                        break;

                    case 4:
                        System.out.print("Ingrese el primer numero: ");
                        int x1 = leer.nextInt();
                        System.out.print("Ingrese el segundo numero: ");
                        int x2 = leer.nextInt();
                        System.out.println("El mcd de " + x1 + " y "+ x2 +" es " + mcd(x1,x2));
                        break;
                        
                    case 5:
                        System.out.print("Ingrese un numero de 2 o mas digitos: ");
                        String numero = leerst.nextLine();
                        while (numero.length()<2){
                            System.out.println("Su numero debe tener 2 o mas digitos");
                            System.out.print("Ingrese su numero nuevamente: ");
                            numero = leerst.nextLine();
                        }
                        System.out.println(numero + " invertido es " + inversion(numero, numero.length()-1));
                        break;
                        
                        
                        
                }
            System.out.println();
            System.out.print(" * * * * * MENU * * * * *  \n 1. Decimal a Binario \n 2. Suma hasta \n 3. Factorial \n 4. MCD"
                    + "\n 5. Numero invertido \n 6. Salir \n Ingrese una opcion: ");
            opcion = leer.nextInt();
        }
        
    }
    
    public static String binario (int num){
        String bin="";
        
        if (num==1 || num==0){
            return bin +=1;
        }
        else {
            return bin+=(binario(num/2) + num%2);
        }
    }
    
    public static int sumahasta (int num,int ini){
        if (ini==num){
            return num;
        }
        else{
            return ini+ sumahasta(num, ini+1);
        }
    }
    
    public static int factorial (int num, int cont){
        if (cont==num){
            return num;
        }
        else if (num==1 || num==0){
            return 1;
        }
        else{
            return cont * factorial (num,cont+1);
        }
    }
    
    public static int mcd (int x1, int x2){
        if (x1 == x2) {
            return x1;
        }
         else if (x2 > x1){
                return mcd(x1, x2-x1);
         }
          else {
                return mcd(x1-x2, x2);
            }
    }
    
    public static String inversion (String numero, int p){
        String inv = "";
         if (p < 0) {
            return inv;
        } 
         else {
            return inv+= (numero.charAt(p) + inversion(numero, p - 1));
         }
        
    }
    
}
