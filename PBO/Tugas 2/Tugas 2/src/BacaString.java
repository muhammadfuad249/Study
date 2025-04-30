/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
/**
 *
 * @author Legion 5 Pro
 */
public class BacaString {
    public static void main(String[] args) throws IOException { 
  // TODO Auto-generated method stub 
  /* Kamus */  
  String str;  
   
   
  BufferedReader datAIn = new BufferedReader(new 
InputStreamReader(System.in)); 
  /* Program */ 
 
  System.out.print ("\nBaca string dan Integer: \n");  
   
  System.out.print("masukkan sebuah string: ");  
   
  str= datAIn.readLine(); 
   
  System.out.println ("String yang dibaca : "+ str); 
   
  
 }
 
} 

