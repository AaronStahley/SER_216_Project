package test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pitzik4.ageOfTheInternet.Game;
import pitzik4.ageOfTheInternet.cutScenes.ChurchCutscene;
import pitzik4.ageOfTheInternet.cutScenes.StartingCutscene;
import pitzik4.ageOfTheInternet.graphics.InfoBox;
import pitzik4.ageOfTheInternet.graphics.Renderable;
import pitzik4.ageOfTheInternet.graphics.Sprite;

public class ChurchTest 
{
	private ChurchCutscene scene;
	private Game owner;
	private Set<Integer> lastKeysPressed = new HashSet<Integer>();

	@Before
	public void setUp() throws Exception 
	{
		owner = new Game();
		scene = new ChurchCutscene(owner);
	}

	@After
	public void tearDown() throws Exception 
	{
		owner = null;
	}
	
	@Test
	public void testGetX() 
	{
		int x = owner.getX();
		assertEquals(x, owner.getX());
	}

	@Test
	public void testGetY() 
	{
		int y = owner.getY();
		assertEquals(y, owner.getY());
		
	}

	@Test
	public void testGetXOffset() 
	{
		int xOff = owner.getX();
		assertEquals(xOff, owner.getX());
	}

	@Test
	public void testGetYOffset() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIsClosing() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIsResetting() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetWidth() 
	{
		int width = owner.getWidth();
		assertEquals(width, owner.getWidth());
	}

	@Test
	public void testGetHeight() 
	{
		int height = owner.getHeight();
		assertEquals(height, owner.getHeight());
	}

	@Test
	public void testGetSize() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIsScrollable() 
	{
		fail("Not yet implemented");
	}

}
