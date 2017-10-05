package br.ufg.inf.tacs.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class TesteFizzBuzz {

	@Test
	public void falaFizz() {
		int numero = 3;
		Assert.assertEquals("fizz", FizzBuzz.fala(numero));
	}

	@Test
	public void falaBuzz() {
		int numero = 5;
		Assert.assertEquals("buzz", FizzBuzz.fala(numero));
	}

	@Test
	public void falaFizzBuzz() {
		int numero = 15;
		Assert.assertEquals("fizzbuzz", FizzBuzz.fala(numero));
	}
	
	@Test
	public void falaNada() {
		int numero = 1;
		Assert.assertEquals("", FizzBuzz.fala(numero));
	}

}
