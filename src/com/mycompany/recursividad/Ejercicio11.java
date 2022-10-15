/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursividad;

/**
 *
 * @author USER
 */
//Crea un método que compruebe si una palabra está ordenada alfabéticamente
public class Ejercicio11 {
    
public static void main(String[] args)
{
    //palabra analizada
    String palabra="abcdef";
    if(orden(palabra)) System.out.println("La palabra esta ordenada alfabeticamente");
    else System.out.println("La palabra NO está ordenada alfabéticamente");
}
//método que comprueba si una palabra está ordenada alfabéticamente
//ejemplo: abcdef -> true
public static boolean orden(String cad)
{
    cad=cad.toLowerCase();
    if(cad.length()>1)
    {
        if(cad.charAt(0)<=cad.charAt(1))
        return orden(cad.substring(1, cad.length()));
        else return false;
    }
    else return true;
}
}