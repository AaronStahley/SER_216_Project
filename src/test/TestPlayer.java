package test;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pitzik4.ageOfTheInternet.Player;

public class TestPlayer 
{
	private int x=0, y=0;
	private Player play;
	private Point[] path = new Point[1];
	
	@Before
	public void setUp() throws Exception 
	{
		play = new Player(x, y, path);
	}

	@After
	public void tearDown() throws Exception 
	{
		play = null;
	}

	@Test
	public void testStepSize() 
	{
		assertEquals(play.stepSize(), 3);
	}

	@Test
	public void testGetX() 
	{
		assertEquals(x, play.getX());
	}

	@Test
	public void testGetY() 
	{
		assertEquals(y, play.getY());
	}

	@Test
	public void testGetXOffset() 
	{
		int xOff = play.getXOffset();
		assertEquals(xOff, play.getXOffset());
	}

	@Test
	public void testGetYOffset() 
	{
		int yOff = play.getYOffset();
		assertEquals(yOff, play.getYOffset());
	}

	@Test
	public void testGoTo() 
	{
		play.goTo(x, y);
		int xOff = play.getXOffset();
		int yOff = play.getYOffset();
		assertEquals(x, play.getX());
		assertEquals(y, play.getY());
		assertEquals(xOff, play.getXOffset());
		assertEquals(yOff, play.getYOffset());
	}

	@Test
	public void testGo() 
	{
		play.go();
		assertEquals(play.going, true);
	}

	@Test
	public void testStop() 
	{
		play.stop();
		assertEquals(play.going, false);
	}

}
