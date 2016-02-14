/*
 * «Copyright 2016 Roberto Reinosa, Daniel Patón»
 * 
 * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * */


/*Para cambiar el aumento de la distancia solo hay que cambiar los valores donde se encuentra la doble barra(//)
por los valores que se quiera.*/

import java.io.IOException;

public class main {
	
	public static int primos[] = new int[9592];
	
	public static void main(String[] args) throws IOException {
		
		
		generador_primos();
		funcion_patrones();
		
	}
	public static void generador_primos(){
		
		int numero_actual = 2;
		boolean comprobador = false;
		int contador = 0;
		int contador_salida=0;
		
		
		while(contador_salida <= 100000){
			
			for(int i = 2; i< numero_actual;i++){
				
				if(numero_actual % i == 0){
					
					comprobador = true;
					break;
				}
			}
			if(comprobador == false){
				
				primos[contador]= numero_actual;
				contador++;
			}
			numero_actual++;
			contador_salida++;
			comprobador = false;
			
		}
			
	}
	public static void funcion_patrones() throws IOException{
		
		int paso = 2;//
        int primo = 0;
        int contador = 0;
        int numeroSuma = 0;
        int contador2 = 0;
        int contadorPrimosLleva = 0;
        int incrementador = 0;
        
        while(contador < primos.length){
        	
        	primo = primos[contador];
        	primo = paso +primo;
        	
        	System.out.println(primo);
        	
        	for(int x = 2; x<primo; x++){
        		
        		if(primo % x == 0){
        			
        			System.out.println("------------------------------------------");
        			paso = 2;//
        			contador2++;
        			incrementador+=2;//
        			numeroSuma = incrementador;
        			
        			
        			contadorPrimosLleva =0;
        			
        			if(contador2 == 500){
        				
        				contador++;
        				numeroSuma = 0;
        				contador2 = 0;
        				paso = 2;//
        				incrementador = 0;
        			}
        			break;
        		}
        		
        	}
        	
        	contadorPrimosLleva++;
        	numeroSuma +=2;//
    		paso += numeroSuma;
   
    		if(contadorPrimosLleva >= 20){
        		System.in.read();
        	}
    		
        }
		
		
	}

}

