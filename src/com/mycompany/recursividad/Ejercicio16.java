/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursividad;

/**
 *
 * @author USER
 */
//Crea un método que compruebe si un número es simétrico. Los números simétricos son iguales a partir 
//del dígito central pero comparando en dirección opuesta
public class Ejercicio16 {
    
public static void main(String[] args)
{
    //valor del número analizado
    int num = 1321;
    if (simetric(num))
            System.out.println("Es simetrico");
        else
            System.out.println("No es simetrico");
}
//método que devuelve la cantidad de dígitos de num
static int digitos(int num)
{
    if(num==0) return 0;
    return 1 + digitos(num/10);
}
//método que devuelve base elevado a exp
static int poten(int base, int exp)
{
    if(exp==1) return base;
    else return base * poten(base,exp-1);
}
//método que comprueba si num es un número es simétrico
//ejemplo: num = 12321 -> true
static boolean simetric(int num)
{
    if(digitos(num)<=1)
        return true;
    else
    {
        int desp = poten(10,digitos(num)-1);
        if(num/desp != num % 10)
            return false;
        else
            return simetric((num-(num/desp)*desp)/10);
    }
}
}