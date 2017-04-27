package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pitzik4.ageOfTheInternet.Button;
import pitzik4.ageOfTheInternet.Game;
import pitzik4.ageOfTheInternet.Menu;
import pitzik4.ageOfTheInternet.XButton;
import pitzik4.ageOfTheInternet.graphics.RenderableString;

public class TestMenu 
{
	private int x=0, y=0;
	private int width=0;
	private Game owner;
	private Menu menu;
	private String[] buttons1 = {"A", "B"};
	@Before
	public void setUp() throws Exception 
	{
		menu = new Menu(owner, x, y, width, buttons1, "Title");
	}

	@After
	public void tearDown() throws Exception 
	{
		menu = null;
	}

	@Test
	public void testGetX() 
	{
		assertEquals(x, menu.getX());
	}

	@Test
	public void testGetY() 
	{
		assertEquals(y, menu.getY());
	}

	@Test
	public void testGetXOffset() 
	{
		int xOff = menu.getXOffset();
		assertEquals(xOff, menu.getXOffset());
	}

	@Test
	public void testGetYOffset() 
	{
		int yOff = menu.getYOffset();
		assertEquals(yOff, menu.getYOffset());
	}

	@Test
	public void testGoTo() 
	{
		menu.goTo(x, y);
		assertEquals(x, menu.getX());
		assertEquals(y, menu.getY());
	}

}
