package br.ufg.inf.tacs.fizzbuzz;

public class FizzBuzz {

	public static String fala(int numero) {
		if(numero%3 == 0 && numero%5 == 0)
			return "fizzbuzz";
		else if (numero%3 == 0)
			return "fizz";
		else if (numero%5 == 0)
			return "buzz";
		else
			return "";
	}

}
