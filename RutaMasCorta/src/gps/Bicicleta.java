package gps;
/**
 * Bicicleta class
 * @author RUBEN lOPEZ dONAIRE
 * @Java IES Severo Ochoa
 * @3.0
 */
import java.util.*;

public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }
    
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int i=0; i<camino1.length; i++)
        {
            sum1 += camino1[i];
        }
        
        for(int n=0; n<camino2.length; n++) {
            sum2 += camino2[n];
        }
            for(int x=0; x<camino3.length; x++) {
            sum3 += camino3[x];
        }
        
        return evaluar(sum1, sum2, sum3);
    }
        
     public static String evaluar(int sum1, int sum2, int sum3) {
        	
    	 if(sum1 < sum2 && sum1 < sum3)
    		{
    		    return "camino 1"; 
    		}
    	 else if(sum2 < sum3 && sum2 < sum1)
    		{
    		    return "camino 2";
    		}
    	 else if(sum3 < sum1 && sum3 < sum2)
    		{
    		    return "camino 3";
    		}
    	 else{
    		    if(sum1 == sum2 && sum2 == sum3)
    		    {
    		        return "camino 1, 2 y 3";
    		    }
    		    else if(sum1 == sum3)
    		    {
    		        return "caminos 1 y 3";
    		    }
    		    else if(sum2 == sum3){
    		        return "caminos 2 y 3";
    		    }
    		    else{
    		        return "caminos 1 y 2";
            }
        }
        	}	
        
    

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {30,34,21,89,25,10};
        int[] camino2 = {24,10,5,6,10,15,21,30};
        int[] camino3 = {1,5,60,7,8,10,20,46,104};
        System.out.println("El camino más corto es:"+Bicicleta.rutaCorta(camino1,camino2,camino3)+".");
    }
}

