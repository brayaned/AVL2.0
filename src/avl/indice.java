/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avl;

import javax.swing.JPanel;

/**
 *
 * @author theglox
 */
public class indice {
    int n;
 AVL avl = new AVL();
    
 void llenar(){
     int c=0,suma=0,aux;
  int[] numeros =new int[100];
  String[]numeros2= new String [100];
  String Nrepetidos="";
 // int []numeros = {7,48,78,20,12,62,34};

    for (int i=0; i < numeros.length; i++){
        numeros[i] = (int) (Math.random()*500);
    }
    //imprimiendo numeros
    for (int i=0; i < numeros.length; i++){
        numeros2[i]=Integer.toString(numeros[i]);
    }
    //sacando numeros repetidos 
//    for(int i=0;i<numeros2.length;i++){
//      for(int j=0;j<numeros2.length-1;j++){
//	if(i!=j){
//            if(numeros2[i].equals(numeros2[j])){// eliminamos su valor
//                Nrepetidos += numeros2[i]+",";
//		numeros2[i]=".";
//               
//            }
//    }}}
   
 
     System.out.println("los numeros repetidos son ;"+Nrepetidos);
     for (int i=0; i < numeros.length; i++){
         System.out.print("i"+numeros[i]+",");}
     System.out.println("");
     for (int i=0; i < numeros.length; i++){
         System.out.print("S"+numeros2[i]+",");
        }
   
    
    for(int i = 0; i<numeros.length; i++){
        aux=avl.insAVL(numeros[i],c);
        System.out.println(avl.insAVL(numeros[i],c));
        suma=suma+aux;
    }    
    for (int i=0; i < numeros.length; i++){
         avl.insAVL(numeros[i],c);
         
    }
     System.out.println("suma +"+suma*2);
    
 
    
    
 }
 
 int retirar (int numero){
     int cr=0;
    int nel= avl.retirarAVL(numero,cr);
     System.out.println("retirar--"+nel);
        return nel; }
  public JPanel getdibujo() {
        return  avl.getdibujo();
    }
}
