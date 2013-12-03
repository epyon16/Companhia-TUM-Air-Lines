/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voo747tumair;

import java.util.Scanner;

/**
 *
 * @author Jorge Sad Martins Filho & Jonas Viriato
 */
public class Voo747TumAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        int ClassA = 1, ClassB = 5, opcao = 0, Contador=1;
        Boolean Passou;
        

   while (Contador<=20) 
     {    
       Passou=true;  
       System.out.println(""); 
       System.out.println("<<|MENU|>>");
       System.out.println("Em Qual Classe o passageiro deseja voar ?");
       System.out.print("Por favor: Digite 1 para a 1ª Classe ou 2 para a 2ª Classe : ");
       Scanner sc = new Scanner(System.in);
       opcao = sc.nextInt();
       switch( opcao )
         {
           case 1: 
             if (ClassA <= 5) 
               {
                 System.out.println("");
                 System.out.println("<PARABÉNS !>");
                 System.out.println("Voo na poltrona "+ClassA+" Marcado com Sucesso na 1ª Classe");
                 opcao = 0;                  
                 ClassA++; 
               }
               
             else
               {
                 System.out.println("");
                 System.out.println("<ALERTA ! #c001> Infelizmente o numero de poltronas na 1ª Classe se esgotou.");
                 System.out.println("Deseja Voar na 2ª Classe?");
                 System.out.println("");
                 System.out.print("Digite 1 para SIM ou 2 para NAO : ");
                 Scanner scc = new Scanner(System.in);
                 opcao = scc.nextInt();
                 switch( opcao )
                   {
                     case 1:
                       ClassB++; 
                       System.out.println("");
                       System.out.println("<PARABÉNS !>");
                       System.out.println("Voo na poltrona "+ClassB+" Marcado com Sucesso na 2ª Classe");                             
                     break; 
                           
                     
                     case 2: Passou=false;
                             
                     
                   }  
                 opcao = 0;
               }
             
                            
           break;
    
           case 2:
             if (ClassB <=20 )
               {
                 ClassB++;  
                 System.out.println("");
                 System.out.println("<PARABÉNS !>");
                 System.out.println("Voo na poltrona "+ClassB+" Marcado com Sucesso na 2ª Classe");
                 opcao = 0;                                    
               }
            
             else 
               
               {
                 System.out.println("");
                 System.out.println("<ALERTA ! #c001> Infelizmente o numero de poltronas na 2ª Classe se esgotou.");
                 System.out.println("Deseja Voar na 1ª Classe?");
                 System.out.println("");
                 System.out.print("Digite 1 para SIM ou 2 para NAO : ");
                 Scanner scv = new Scanner(System.in);
                 opcao = scv.nextInt();
                 switch( opcao )
                   {
                     case 1:
                       ClassA++; 
                       System.out.println("");
                       System.out.println("<PARABÉNS !>");
                       System.out.println("Voo na poltrona "+ClassA+" Marcado com Sucesso na 1ª Classe");                             
                     break; 
                           
                     
                     case 2: Passou=false;
                             
                     
                   }  
                 opcao = 0;
               }  
               
           break;
    
           default:
             System.out.println("Alerta ! #c004: O valor inserido não corresponde com as alternativas.");
            
        }
       if (Passou) 
         {
       Contador++;
         }
       
     }
   
   if (Contador > 20) 
       
   {
       System.out.println("");
       System.out.println("<<Alerta!>> O Voo está lotado. Porfavor Aguarde o próximo Avião.");
       System.out.println("FIM");
       
   }
   
                                                }
}
