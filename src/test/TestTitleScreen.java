package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pitzik4.ageOfTheInternet.Game;
import pitzik4.ageOfTheInternet.PauseScreen;
import pitzik4.ageOfTheInternet.TitleScreen;

public class TestTitleScreen 
{

	private int x=0, y=0;
	private int width=0, height=0;
	private TitleScreen screen;
	private Game owner;
	
	@Before
	public void setUp() throws Exception 
	{
		screen = new TitleScreen(owner);
	}

	@After
	public void tearDown() throws Exception 
	{
		screen = null;
	}

	@Test
	public void testGetX() 
	{
		assertEquals(x, screen.getX());
	}

	@Test
	public void testGetY() 
	{
		assertEquals(y, screen.getY());
	}

	@Test
	public void testGetXOffset() 
	{
		int xOff = screen.getXOffset();
		assertEquals(xOff, screen.getXOffset());
	}

	@Test
	public void testGetYOffset() 
	{
		int yOff = screen.getYOffset();
		assertEquals(yOff, screen.getYOffset());
	}

	@Test
	public void testGoTo() 
	{
		screen.goTo(x, y);
		int xOff = screen.getXOffset();
		int yOff = screen.getYOffset();
		x = screen.getX();
		y = screen.getY();
		assertEquals(x, screen.getX());
		assertEquals(y, screen.getY());
		assertEquals(xOff, screen.getXOffset());
		assertEquals(yOff, screen.getYOffset());
	}
	@Test
	public void testIsClosing()
	{
		boolean test = screen.isClosing();
		assertEquals(test, screen.isClosing());
	}
	@Test
	public void testGetWidth()
	{
		width = screen.getWidth();
		assertEquals(screen.getWidth(), width);
	}
	@Test
	public void testGetHeight()
	{
		height = screen.getHeight();
		assertEquals(screen.getHeight(), height);
	}
	@Test
	public void testIsScrollable()
	{
		assertEquals(false, screen.isScrollable());
	}
	@Test
	public void testIsResetting()
	{
		assertEquals(false, screen.isResetting());
	}
}
