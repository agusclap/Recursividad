
package ejercicios;

import java.util.Scanner;


public class Ejercicios {
    
    public static int recursividad(int nro){
        int resultado = 0;
        if(nro==0 || nro==1){
            return 1;
        }else if(nro<0){
            System.out.println("ERROR");
        }else{
            resultado = nro*recursividad(nro-1);
        }
        return resultado;
    }
    
    public static int recursividadSuma(int nro){
        int resultado=0;
        if(nro==0){
            return 0;
        }else if(nro<0){
            System.out.println("ERROR");
        }else{
            resultado = nro + recursividadSuma(nro-1);
        }
        return resultado;
    }
    
    public static int recursividadPotencia(int nro, int pot){
        int resultado = 0;
        if(pot==0){
            return 1;
        }else{
            resultado = nro * recursividadPotencia(nro,pot-1);
        }
        return resultado;
    }
   
    public static int conteo(int nro){
        
        if(nro==0){
            System.out.println("0");
        }else if(nro<0){
            System.out.println("ERROR");
        }else{
            System.out.println(nro);
            System.out.println(conteo(nro-1));
        }
        return 0;
    }
   
    public static int sumaSucesiva(int nro, int v){
        int resultado=0;
        if(v==0){
            return 0;
        }else if(nro<0){
            throw new IllegalArgumentException("Numero negativo");
        }else{
            resultado = nro + sumaSucesiva(nro,v-1);
        }
        return resultado;
    }
    
    public static int imprimirArreglo(int [] a, int cant) {
        if(cant < 0){
            throw new IllegalArgumentException("ERROR");
        }else if(cant==0){
            return 0;
        }else{
            System.out.println(a[cant-1]);
            imprimirArreglo(a,cant-1);
        }
        return 0;
    }

    public static int imprimirBinario(int nro){
        if (nro < 2) {
            System.out.print(nro);
        } else {
            imprimirBinario(nro / 2);
            System.out.print(nro % 2);
        }
        
        
        return 0;
    }
   
    public static void main(String[] args) {
        char seguir = ' ';
        int opcion=0;
        int nro=0;
        Scanner console = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero entero positivo");
            nro = console.nextInt();
            System.out.println("1) Calcular factorial");
            System.out.println("2) Calcular suma de enteros");
            System.out.println("3) Calcular la potencia del numero");
            System.out.println("4) Imprimir conteo regresivo");
            System.out.println("5) Calcular Multipicacion");
            System.out.println("6) Imprimir arreglo de forma inversa");
            System.out.println("7) Imprimir numero en binario");
            opcion = console.nextInt();
            switch(opcion){
                case 1:
                {
                   System.out.println("El resultado es: " + recursividad(nro)); 
                   break;
                }
                case 2:
                {
                    System.out.println("El resultado es: " + recursividadSuma(nro));
                    break;
                }
                case 3:
                {
                    int potencia=0;
                    System.out.println("Ingrese la potencia a elevar del numero");
                    potencia = console.nextInt();
                    System.out.println("El resultado es: " + recursividadPotencia(nro,potencia));
                    break;
                }
                case 4:
                {
                    conteo(nro);
                    break;
                }
                case 5:
                {
                    int v=0;
                    System.out.println("Ingrese cuantas veces desea multiplicar el numero");
                    v = console.nextInt();
                    System.out.println("El resultado es: " + sumaSucesiva(nro,v));
                    break;
                }
                case 6:
                {
                    int valor = 0;
                    int [] arreglo = new int[nro];
                    for(int i=0;i<nro;i++){
                        System.out.println("Ingrese valor para el arreglo");
                        valor = console.nextInt();
                        arreglo[i] = valor;
                    }
                    imprimirArreglo(arreglo,nro);
                }
                case 7:
                {
                    imprimirBinario(nro);
                    System.out.println("");
                    break;
                }
            }
            System.out.println("Desea continunar ? y/n");
            seguir = console.next().charAt(0);
        }while(seguir=='y' || seguir=='Y');
    }
    
}
