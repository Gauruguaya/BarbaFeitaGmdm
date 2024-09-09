
package barbafeita;

import barbafeita.métodos.ValidarCPF;
import java.util.Scanner;

public class BarbaFeita {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
   	 
    	System.out.print("Registrar un barbero? (si/no): ");
    	String respuesta = input.nextLine();
   	 
    	if(respuesta.equalsIgnoreCase("si")){
         	System.out.print("Ingrese el nombre del barbero: ");
         	String nombre = input.nextLine();
        	 
                	String cpf;
                	do{
               	 
          	System.out.print("Ingrese el CPF del barbero: ");
          	cpf = input.nextLine();
                	if(!ValidarCPF.isCPF(cpf)){
          	System.out.println("CPF inválido. Intente de nuevo.");   
                	}
            	}while (!ValidarCPF.isCPF(cpf));
               	 
          	System.out.print("Ingrese el teléfono del barbero: ");
                	}
	
        //en idCliente ver si es menor de edad
    }
    
}
