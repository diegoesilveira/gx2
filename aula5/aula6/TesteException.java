package aula6;

import java.util.ArrayList;
import java.util.List;

public class TesteException {
	
	public static void main(String[] args) {
		
		List<Cliente> cliente = new ArrayList<>();
		
		cliente.add(new Cliente("Diego Silveira", "01599030303"));
		cliente.add(new Cliente("Ana", "000554454545"));
		cliente.add(new Cliente("Edu Silveira", "01599030303"));
		cliente.add(new Cliente("Alex Silveira", "01599030303"));
		cliente.add(new Cliente("Silveira", "01599030303"));
		cliente.add(new Cliente("Evaldt", "01599030303"));
		
		
		System.out.println(cliente);
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		
		
		
	}

}
