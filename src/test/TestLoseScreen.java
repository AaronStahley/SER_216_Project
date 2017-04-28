package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pitzik4.ageOfTheInternet.Game;
import pitzik4.ageOfTheInternet.LoseScreen;

public class TestLoseScreen 
{

	private int x=0, y=0;
	private Game owner;
	private int width, height;
	private LoseScreen lose;

	@Before
	public void setUp() throws Exception 
	{
		lose = new LoseScreen(owner, x, y, height, width, "Reason");
	}

	@After
	public void tearDown() throws Exception 
	{
		lose = null;
	}

	@Test
	public void testLoseScreen() 
	{
		LoseScreen screen = new LoseScreen(owner, x, y, height, width, "Reason");
	}

	@Test
	public void testGetX() 
	{
		assertEquals(lose.getX(), x);
	}

	@Test
	public void testGetY() 
	{
		assertEquals(lose.getY(), y);
	}

	@Test
	public void testGetXOffset() 
	{
		int xOff = lose.getXOffset();
		assertEquals(lose.getXOffset(), xOff);
	}

	@Test
	public void testGetYOffset() 
	{
		int yOff = lose.getYOffset();
		assertEquals(yOff, lose.getYOffset());
	}

	@Test
	public void testGoTo() 
	{
		lose.goTo(x, y);
		assertEquals(lose.getX(), x);
		assertEquals(lose.getY(), y);
	}

}
