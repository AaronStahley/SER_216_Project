package test;

import static org.junit.Assert.*;

import java.awt.Point;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pitzik4.ageOfTheInternet.Hacker;

public class HackerTest 
{
	private int x=0, y=0;
	public boolean going=false;
	private Point[] path;
	public static final int STEP_SIZE = 3;
	public Hacker hack;
	
	@Before
	public void setUp() throws Exception 
	{
		
		hack = new Hacker(x,y, path);
	}

	@After
	public void tearDown() throws Exception 
	{
		hack = null;
	}

	@Test
	public void testGetX() 
	{
		assertEquals(x, hack.getX());
	}

	@Test
	public void testGetY() 
	{
		assertEquals(y, hack.getY());
	}

	@Test
	public void testGetXOffset() 
	{
		int xOff = hack.getXOffset();
		assertEquals(xOff, hack.getXOffset());
	}

	@Test
	public void testGetYOffset() 
	{
		int yOff = hack.getYOffset();
		assertEquals(yOff, hack.getYOffset());
	}
	@Test
	public void testGoto()
	{
		hack.goTo(x, y);
		assertEquals(x, hack.getX());
		assertEquals(y, hack.getY());

	}
	@Test
	public void testGo()
	{
		hack.go();
		assertEquals(hack.going, true);
	}
	@Test
	public void testStop()
	{
		hack.stop();
		assertEquals(hack.going, false);
	}
	@Test
	public void testTick()
	{
		hack.tick();
		assertEquals(x, hack.getX());
	}

}
