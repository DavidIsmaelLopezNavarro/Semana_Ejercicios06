/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursividad;

/**
 *
 * @author USER
 */
//Crea un método que compruebe si una palabra es un palíndromo
public class Ejercicio12 {
    
public static void main(String[] args)
{
    //palabra analizada
    String s="reconocer";
    if(palin(s)) System.out.println("Es un palindromo");
    else System.out.println("No es un palíndromo");
}
//método que comprueba si una palabra es un palíndromo
//ejemplo: reconocer -> true
public static boolean palin(String frase)
{
    frase=frase.toLowerCase();
    if(frase.length()<=1) return true;
    else
    {
        if(frase.charAt(0)==frase.charAt(frase.length()-1))
        return palin(frase.substring(1, frase.length()-1));
        else return false;
    }
}
}