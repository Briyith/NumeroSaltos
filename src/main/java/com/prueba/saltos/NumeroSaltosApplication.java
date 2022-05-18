package com.prueba.saltos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NumeroSaltosApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(NumeroSaltosApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("El numero de Saltos que la rana requiere para llegar al otro lado es = "
				+ saltos(10, 85, 30));
		
	}
	
	//Función que permite calcular el numero de saltos...
	public int saltos(int X, int Y, int D){
		int nSaltos;
		//Evaluamos que la posición final sea mayor que la posisición final y de ser asi evaluamos la distancia faltante.
		if(Y > X) {
			int dFaltante = Y-X ;
			/*Evaluamos que la distancia faltante sea  mayor a la capacida de distancia 
			que puede dar la rana de  lo contrario la rana solo necesitaria un solo salto.*/
			 if(dFaltante > D ) {
				nSaltos = dFaltante/D;
				System.out.println(nSaltos);
				int sDistancia = nSaltos * D;
				
				while (sDistancia < dFaltante) {
					nSaltos++;
					sDistancia = nSaltos * D;
				}
				
			 }else {
				 nSaltos = 1;
			 }
		}else{
			nSaltos = 0;
		}
		
		return nSaltos;
		
	}

}
