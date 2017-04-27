package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pitzik4.ageOfTheInternet.Game;

public class GameTest 
{
	public int x, y, width, height;
	public boolean focus;
	private Game owner;

	@Before
	public void setUp() throws Exception 
	{
		x = 10;
		y = 10;
		width = 100;
		height = 100;
		focus = true;
		owner = new Game();
	}

	@After
	public void tearDown() throws Exception 
	{
		owner = null;
	}

	@Test
	public void testIsFocusable() 
	{
		assertEquals(owner.isFocusable(), focus);
	}

	@Test
	public void testMouseRelease()
	{
		boolean mouseDown = owner.mouseDown;
		assertEquals(mouseDown, false);
	}
	@Test
	public void testPause()
	{
		assertEquals(owner.paused, false);
		
	}
	@Test
	public void testFocusGain()
	{
		owner.pause(false);
		assertEquals(owner.paused, false);
	}
	public void testFocusLost()
	{
		owner.pause(true);
		assertEquals(owner.paused, true);
	}
	@Test
	public void testInit()
	{
		assertEquals(owner, owner);
	}
	
}
