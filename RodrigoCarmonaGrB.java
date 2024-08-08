
package rodrigocarmonagrb;

import java.util.Scanner;
import java.util.Arrays;

public class RodrigoCarmonaGrB {
    
    public static void convertidorDeBi(int[] lista,int nro) {
        int k=0;
    do{      //aca veo si el numero es 1 o 2, sino es entonces saco su resto, lo guardo usando de aux k, luego sumo 1 en k y divido el nro 2 
      if((nro==1)||(nro==0)){   // hasta que entra cuando nro es 1 o 0 y k se vuelve 9 y se el ciclo
          lista[k]=(nro);
   
          k=9;
                  }
      else{
          lista[k]=nro%2;

          k++;
      }
      nro=nro/2;

        
        
    }
    while(k!=9); 
        
}    
    
   public static void invertirArray(int[] list){
    for (int i = 0; i < list.length / 2; i++) {
        int temp = list[i];
        list[i] = list[list.length - 1 - i];
        list[list.length - 1 - i] = temp;
    }
}
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero de 0 a 511: ");
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        while(num<0 || num>511){
            System.out.println("Numero invalido");
            System.out.println("Ingrese un numero de 0 a 511: ");
            num=input.nextInt();
            
        }
        
    int[] myList =new int[9]; //Creo un array de tamaño 9
    
              
        convertidorDeBi(myList,num); // llamo al metodo para convertir el numero decimal a binario 
        
        invertirArray(myList);  // lo invierto
     
        System.out.println(Arrays.toString(myList)); //imprimo
        
       String[] CaSe=new String[9]; //lo convierto en un array con su cara correspondiente
       int aux=0;           
         for(int i: myList){
             if(i==0)
                 CaSe[aux]="C";
             else
                 CaSe[aux]="S";
            aux++; 
         }
         aux=0;
        String[][] MatrizCS = { {"","",""},{"","",""},{"","",""}}; // creo una matriz 3x3 vacia
        for(int i=0; i<3; i++){ //como es una matriz 3x3 i y j llegan hasta 2, luego uso un aux que empieza de 0 para recorrer el array de caras
         
            for(int j=0; j<3; j++){
                MatrizCS[i][j]= CaSe[aux];
                aux++;
                        }
                }
       for(int i=0; i<MatrizCS.length; i++) {
            for(int j=0; j<MatrizCS[0].length; j++) {
                System.out.print(MatrizCS[i][j] + " "); // aca se imprime cada elemento de la matriz 3x3
      }
      System.out.println();  
    }   
    }
}
