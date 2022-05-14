
package ejerciciovectores;


public class EjerciciosVectores2 {
     int suma;
    int promedio;
    int[] listado= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    
     
   
public void Vectores(){    
    for(int i=0; i<listado.length; i++){
    suma+=listado[i];
    promedio = suma/listado.length;
    System.out.println("la suma de los elementos es de: "+suma);
    System.out.println("El promedio de los elementos es de: "+promedio);
}
}
}
