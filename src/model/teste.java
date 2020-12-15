/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author maikon.rosa
 */
public class teste {
    public static void main(String[] args) {
        String numero= "(14)9980a-8697";
        String numerocerto = numero.replaceAll("-", "").replace("(", "").replace(")","") ;
        int n = Integer.valueOf(numerocerto);
        System.out.println(n);
    }
}
