package pitzik4.ageOfTheInternet;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;

import pitzik4.ageOfTheInternet.graphics.BlueFrame;
import pitzik4.ageOfTheInternet.graphics.Renderable;
import pitzik4.ageOfTheInternet.graphics.RenderableString;

public class PauseScreen implements Renderable,Stage,Tickable {
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int height = 0;
	private RenderableString message;
	private BlueFrame frame;
	private Game owner;
	
	//Declares button variables for the pause screen. 
	private Button directionsButton; 
	private Button exitButton;
	private Button restartButton;
	
	public PauseScreen(int x, int y, int width, int height) {
		this(x, y, width, height, Game.game);
	}
	public PauseScreen(int x, int y, int width, int height, Game owner) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.frame = new BlueFrame(x, y, width, height);
		this.message = new RenderableString("Game Paused", 0, 80);
		this.message.centerBetweenX(x, x+width);
	//	this.message.centerBetweenY(y, y+height);
		
		// Instantiates the buttons on the pause screen
		directionsButton = new Button(owner,96,127,128,"Directions");
		restartButton = new Button(owner,96,160,128,"Restart");
		exitButton = new Button(owner,96,191,128,"Exit to Menu");
	}

	@Override
	public BufferedImage draw() {
		BufferedImage tmp = new BufferedImage(width+x, height+y, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = tmp.createGraphics();
		drawOn(g, 0, 0);
		g.dispose();
		BufferedImage out = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		g = out.createGraphics();
		g.drawImage(tmp, -x, -y, null);
		g.dispose();
		return out;
	}

	@Override
	public void drawOn(Graphics2D g, int scrollx, int scrolly) {
		scrollx = 0;
		scrolly = 0;
		
		frame.drawOn(g, scrollx, scrolly);
		message.drawOn(g, scrollx, scrolly);
		
		//Draws the directions button on the screen.
		directionsButton.drawOn(g, scrollx, scrolly);
		
		//Draws the exit button on the screen.
		exitButton.drawOn(g, scrollx, scrolly);
		
		//Draws the restart button on the screen. 
		restartButton.drawOn(g, scrollx, scrolly);
	}
	
	@Override
	public void tick(){
		directionsButton.tick();
		restartButton.tick();
		exitButton.tick();
		
		if(exitButton.isClicked){
			// Go back to the title screen.
			System.exit(0); 

		}
		
		//Displays the directions when clicked 
		if(directionsButton.isClicked){
			
			if(directionsButton.isClicked){
				
				// Make a pop up window that displays the directions of the game.  
				
				//Directions pop up menu. 
				JOptionPane.showMessageDialog(owner,
					  "Objective:\n"
				    + "Escape by hacking various types of computers\n"
				    + "to get to the laboratory which possess the machine\n"
				    + "to bring you back into the real world.\n"
				    + "\n"
				    + "Game Play:\n"
				    + "Click on a computer to interact. Hacking computers\n"
				    + "will advance you through the level but each computer\n"
				    + "costs RAM to hack. Hack into corporations to\n"
				    + "(yellow computers) to make money. If you are out of\n"
				    + "ram you’ll have to upgrade your home computer by\n"
				    + "using the cash you made from the corporations.\n"
				    + "If the corporate computers are flashing you must\n"
				    + "secure them by clicking on the computer and pressing\n"
				    + "the secure button.\n"
				    + "\n"
				    + "Navigation:\n"
				    + "Use the arrow keys to move across the level and reveal\n"
				    + "more computers to hack.\n",
				    "Directions",
				    JOptionPane.PLAIN_MESSAGE);
		
			}
			
		}
		if(restartButton.isClicked){
			//restart the current level. 
		}
	}
	
	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getXOffset() {
		return 0;
	}

	@Override
	public int getYOffset() {
		return 0;
	}

	@Override
	public void goTo(int x, int y) {
		int dx = x - this.x;
		int dy = y - this.y;
		this.x = x;
		this.y = y;
		frame.goTo(frame.getX()+dx, frame.getY()+dy);
		message.goTo(message.getX()+dx, message.getY()+dy);
	}
	@Override
	public boolean isClosing() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isResetting() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isScrollable() {
		// TODO Auto-generated method stub
		return false;
	}

}