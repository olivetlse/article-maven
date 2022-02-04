package com.developpez;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Un test pour l'article Maven.
 * 
 * @author Baptiste Wicht
 */
public class ArticleMavenTest {
	@Test
	public void testGetDescription() {
		assertEquals(ArticleMaven.getDescription(), "Je suis un article de Developpez");
	}
}