package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pitzik4.ageOfTheInternet.Button;
import pitzik4.ageOfTheInternet.Game;

public class ButtonTest 
{
	
	private Game owner;

	private Button button;
	private int xOff;
	private int yOff;
	private int x=0, y=0;
	public boolean isClicked = false;
	public boolean isScrolled = false;
	public boolean nowClicked = false;
	public static final int BUTTON_SPRITE = 50;
	@Before
	public void setUp() throws Exception 
	{
		owner = new Game();
		button = new Button(owner, 96, 160, 128, "Start Game");
		y = button.getY();
		x = button.getX();
		xOff = button.getXOffset();
		yOff = button.getYOffset();
		
	}

	@After
	public void tearDown() throws Exception 
	{
		owner = null;
		button = null;
		
	}

	@Test
	public void testGetX() 
	{
		assertEquals(x, button.getX());
	}

	@Test
	public void testGetY() 
	{
		assertEquals(y, button.getY());
	}

	@Test
	public void testGetXOffset() 
	{
		assertEquals(xOff, button.getXOffset());
	}

	@Test
	public void testGetYOffset() 
	{
		assertEquals(yOff, button.getYOffset());

	}
	@Test
	public void testGoto()
	{
		button.goTo(x, y);
		assertEquals(x, button.getX());
		assertEquals(y, button.getY());
	}
	@Test
	public void testDraw() 
	{
		button.draw();
		
	
	}
	@Test
	public void testBeClicked()
	{
		button.beClicked(true);
		assertEquals(button.isClicked, true);
		button.beClicked(false);
		assertEquals(button.isClicked, false);
	}
	@Test
	public void testBeScrolled()
	{
		button.beScrolled(true);
		assertEquals(button.isScrolled, true);
		button.beScrolled(false);
		assertEquals(button.isScrolled, false);
	}
}

