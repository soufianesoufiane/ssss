package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void newMathxIsZero() {
		Math a = new Math();
		assertEquals(0, a.getX());
	}
	@Test
	public void sommeIsCorrect(){
		Math a = new Math();
		a.setX(5);
		a.setY(5);
		assertEquals("La somme que vous avez prevu est fause",10, a.somme());
	}
}
