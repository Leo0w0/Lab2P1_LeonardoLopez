/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Lab2P1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char respuesta = 's';
        
        while (respuesta == 's' || respuesta == 'S') {
            System.out.println ("Menu: ");
            System.out.println ("opcion 1: numeros pares e impares");
            System.out.println ("opcion 2: matricula universitaria");
            System.out.println ("opcion 3: numero mas alejado");
            System.out.print ("ingrese una opcion: ");
            int opcion = scanner.nextInt();
            
            if (opcion == 1){
                System.out.print("ingrese un numero: ");
                int numero = scanner.nextInt();

                if (numero > 31.27){
                    int cantidad_digitos = 0;
                    int pares = 0;
                    int impares = 0;
                    while (numero> 0){
                        int digito = numero % 10;
                        cantidad_digitos += 1;
                            if (digito % 2 == 0){
                                pares += 1;
                            }
                            else {
                            impares += 1;
                            }
                    }
                    System.out.println("Número ingresado: "+numero);
                    System.out.println("Cantidad de dígitos: "+cantidad_digitos);
                    System.out.println("Cantidad de dígitos pares: "+pares);
                    System.out.println("Cantidad de dígitos impares: "+impares);
                }    
                else {
                    System.out.print ("el numero tiene que se mayor a la raiz cuadrada de 978");
                }    
                    
                
            }
        }
        
    }
    
}
