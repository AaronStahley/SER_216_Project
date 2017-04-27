package test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pitzik4.ageOfTheInternet.Game;
import pitzik4.ageOfTheInternet.Level;
import pitzik4.ageOfTheInternet.tiles.Tile;

public class LevelTest 
{
	public Tile[][] tiles;
	public Tile tyle;
	public Level lev;
	public int width;
	public int height;
	public int x=0;
	public int y=0;
	public int yOff;
	public int xOff;
	public Game owner;
	private boolean closing = false;
	private boolean resetting = false;
	public static final int[] levelRAMs = {20, 30, 0, 15, 10, 25, 95};
	public static final int[] levelMoneys = {0, 0, 26, 0, 0, 0, 95};
	
	@Before
	public void setUp() throws Exception 
	{
		width = 10;
		height = 10;
		xOff = x-this.x;
		yOff = y - this.y;
		lev = new Level(1, owner, x, y);
		tiles = new Tile[1][1];
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void testGetX() 
	{
		assertEquals(x, lev.getX());
	}

	@Test
	public void testGetY() 
	{
		assertEquals(y, lev.getY());
	}

	@Test
	public void testGetXOffset() 
	{
		assertEquals(xOff, lev.getXOffset());
	}

	@Test
	public void testGetYOffset() 
	{
		assertEquals(yOff, lev.getYOffset());

	}

	@Test
	public void testGoTo() 
	{
		lev.goTo(x, y);
		assertEquals(xOff, lev.getXOffset());
		assertEquals(yOff, lev.getYOffset());
		assertEquals(x, lev.getX());
		assertEquals(y, lev.getY());
	}

	@Test
	public void testIsClosing() 
	{
		lev.isClosing();
		assertEquals(closing, false);
	}

	@Test
	public void testGetWidth() 
	{
		width = lev.getWidth();
		assertEquals(width, lev.getWidth());
	}

	@Test
	public void testGetHeight() 
	{
		height = lev.getHeight();
		assertEquals(height, lev.getHeight());
	}

	@Test
	public void testGetSize() 
	{
		lev.getSize();
		height = lev.getHeight();
		width = lev.getWidth();
		assertEquals(height, lev.getHeight());
		assertEquals(width, lev.getWidth());
	}

	@Test
	public void testIsOwnedIntInt() {
		assertEquals(lev.isOwned(x, y), true);
		
	}

	@Test
	public void testIsOwnedTile() 
	{
		assertEquals(lev.isOwned(tiles[0][0]), false);
	}

	@Test
	public void testCanBeHackedBy() 
	{
		assertEquals(lev.canBeHackedBy(tyle), null);
	}

	@Test
	public void testCanBeEviledBy() 
	{
		assertEquals(lev.canBeEviledBy(tyle), null);
	}

	@Test
	public void testIsScrollable() 
	{
		assertEquals(!lev.getLost(), lev.isScrollable());
	}

	@Test
	public void testSetRAM() 
	{
		lev.setRAM(15);
		assertEquals(15, lev.getRAM());
	}

	@Test
	public void testGetRAM() 
	{
		int ram = lev.getRAM();
		assertEquals(ram, lev.getRAM());
	}

	@Test
	public void testIsResetting() 
	{
		assertEquals(resetting, lev.isResetting());
	}
	@Test
	public void testGetMoney()
	{
		assertEquals(0, lev.getMoney());
	}

	@Test
	public void testCanUpgrade() 
	{
		assertEquals(lev.canUpgrade(), false);
	}

	@Test
	public void testIsEvilIntInt() 
	{
		assertEquals(lev.isEvil(x, y), false);
	}

	@Test
	public void testIsEvilTile() 
	{
		assertEquals(lev.isEvil(tyle), false);
	}
	@Test
	public void testGetLost()
	{
		assertEquals(false, lev.getLost());
	}
	@Test
	public void testSetMoney()
	{
		lev.setMoney(100);
		assertEquals(lev.getMoney(), 100);
	}
	@Test
	public void testSetLost()
	{
		lev.setLost(false);
		assertEquals(lev.getLost(), false);
	}

}
