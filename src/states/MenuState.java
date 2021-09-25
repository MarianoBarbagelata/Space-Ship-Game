package states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import gameObjects.Constants;
import graphics.Assets;
import graphics.Loader;
import graphics.Fonts;
import math.Vector2D;
import ui.Action;
import ui.Button;

public class MenuState extends State{
	
	private ArrayList<Button> buttons;
	private Font font;
	public MenuState() {
		buttons = new ArrayList<Button>();
		
		buttons.add(new Button(Assets.greyButton, Assets.blueButton, Constants.WIDTH / 2 - Assets.greyButton.getWidth()/2, 
				Constants.HEIGHT / 2 - Assets.greyButton.getHeight() * 2, Constants.PLAY, new Action() {
			public void doAction() {
				State.changeState(new GameState());
			}
		}
		));
		
		buttons.add(new Button(Assets.greyButton, Assets.blueButton, Constants.WIDTH / 2 - Assets.greyButton.getWidth()/2, 
				Constants.HEIGHT / 2 + Assets.greyButton.getHeight() * 2 , Constants.EXIT, new Action() {
			public void doAction() {
				System.exit(0);
			}
		}
		));
		
		buttons.add(new Button(Assets.greyButton, Assets.blueButton, Constants.WIDTH / 2 - Assets.greyButton.getWidth()/2, 
				Constants.HEIGHT / 2, Constants.SCORES, new Action() {
			public void doAction() {
				State.changeState(new ScoreState());
			}
		}
		));
		
	}
	
	
	@Override
	public void update(float dt) {
		for(Button b: buttons) {
			b.update();
		}
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		for (Button b: buttons) {
			b.draw(g);
		}
		font = Loader.loadFont("/fonts/futureFont.ttf", 42);
		Fonts.drawText(g2d, "SPACE SHIP GAME", new Vector2D(Constants.WIDTH / 2, Constants.HEIGHT / 2 - 150),
				true, Color.WHITE, font);
	}

}
