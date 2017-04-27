package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pitzik4.ageOfTheInternet.Game;
import pitzik4.ageOfTheInternet.Menu;
import pitzik4.ageOfTheInternet.graphics.Sprite;
import pitzik4.ageOfTheInternet.tiles.ChurchTile;

public class testChurchTile 
{
	private Game owner;
	private Menu rightClickMenu = null;
	public boolean yours = false;
	public ChurchTile church;
	public static final int RI_CLI_MENU_WIDTH = 96;
	public String[] riCliMenuOptions = {"Hack"};
	public String riCliMenuTitle = "Church";
	int x, y;
	
	@Before
	public void setUp() throws Exception 
	{
		x = 10;
		y = 20;
		church = new ChurchTile(x, y, owner);
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void testBeOwned() 
	{
		church.beOwned();
	}

	@Test
	public void testUnHack() 
	{
		church.unHack();
		assertEquals(yours, church.yours);
	}

	@Test
	public void testHackCost() 
	{
		assertEquals(5, church.hackCost());
	}

	@Test
	public void testTick() {
		fail("Not yet implemented");
	}

	@Test
	public void testHack() 
	{
		church.hack();
		assertEquals(yours, church.yours);
		riCliMenuOptions[0] = "Unhack";
		assertEquals(riCliMenuOptions[0], church.riCliMenuOptions[0]);
	}

}
