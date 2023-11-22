/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarydecimal.java;
// Java Program to convert from decimal to binario

//Programa Java para pasar de decimal a binario

//this program reads an integer number that id given by the final user and it shows its value in the binary numeric system (0,1)

//el programa lee un número entero que se le pide al usuario y muestra su valor en sistema binario(0,1)
import java.util.Scanner;

public class BinaryDecimal {

    
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=0;   
	int i=0;
        System.out.println("Introduzca un número que sea mayor que 0");                                                           
        n = sc.nextInt();
        System.out.print("\nBinario: ");
        decBin(n);
    }

  
    //Método para pasar de decimal a binario
    public static void decBin(int n) {
        if (n % 2!=0) {
            System.out.print(1);
        }
        else if(n%2==1)
        {
            System.out.println(1);
        }
                      
        else {
            decBin(n / 2);
            System.out.print(n%2);
        }
    }


}
