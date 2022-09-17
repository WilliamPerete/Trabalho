/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    
    
    public static void main(String[] args) {
        
        try{
            Socket cliente = new Socket("127.0.0.1",12345);
            
            System.out.println("Cliente concluido!");
            //cliente.close();
            //Socket socket = cliente.accept();
            PrintStream saida = new PrintStream(cliente.getOutputStream());
            Scanner teclado = new Scanner(System.in);
           while (teclado.hasNextLine()) {
            saida.println(teclado.nextLine());
            
            saida.close();
            teclado.close();
            cliente.close();
            }
        
    }catch(Exception e){
        System.out.println("Erro1: " + e.getMessage());
    }

    //public Cliente(String ip ,int port) throws IOException {
        
        
        
       // Socket cliente = new Socket(ip,port);
       // System.out.println("Servidor conectado !");

        
        
        //PrintStream saida = new PrintStream(cliente.getOutputStream());
        //Scanner teclado = new Scanner(System.in);
        //while (teclado.hasNextLine()) {
          //  saida.println(teclado.nextLine());
        //}
        //saida.close();
        //teclado.close();
        //cliente.close();
    }
}