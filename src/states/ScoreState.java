package states;

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

import gameObjects.Constants;
import graphics.Assets;
import graphics.Fonts;
import io.JSONParser;
import io.ScoreData;
import math.Vector2D;
import ui.Action;
import ui.Button;

public class ScoreState extends State{
	
	private Button returnButton;
	
	private PriorityQueue<ScoreData> scores;
	
	private Comparator<ScoreData> scoreComparator;
	
	private ScoreData[] auxArray;
	
	public ScoreState() {
		returnButton = new Button(Assets.greyButton, Assets.blueButton, Assets.greyButton.getHeight(), 
				Constants.HEIGHT - Assets.greyButton.getHeight() * 2, Constants.RETURN, new Action() {
			public void doAction() {
				State.changeState(new MenuState());
			}
		}
		);
		
		scoreComparator = new Comparator<ScoreData>() {
			@Override
			public int compare(ScoreData e1, ScoreData e2) {
				return e1.getScore() < e2.getScore() ? -1: e1.getScore() > e2.getScore() ? 1: 0;
			}
		};
		
		scores = new PriorityQueue<ScoreData>(10, scoreComparator);
		
		try {
			ArrayList<ScoreData> dataList = JSONParser.readFile();
			
			for (ScoreData d: dataList) {
				scores.add(d);
			}
			
			while (scores.size() > 10) {
				scores.poll();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void update(float dt) {
		returnButton.update();
	}

	@Override
	public void draw(Graphics g) {
		returnButton.draw(g);
		
		auxArray = scores.toArray(new ScoreData[scores.size()]);
		
		Arrays.sort(auxArray, scoreComparator);
		
		
		Vector2D scorePos = new Vector2D(Constants.WIDTH / 2 - 200, 100);
		
		Vector2D datePos = new Vector2D(Constants.WIDTH / 2 + 200, 100);
		
		Fonts.drawText(g, Constants.SCORE, scorePos, true, Color.BLUE, Assets.fontBig);
		Fonts.drawText(g, Constants.DATE, datePos, true, Color.BLUE, Assets.fontBig);
		
		scorePos.setY(scorePos.getY() + 40);
		datePos.setY(datePos.getY() + 40);
		
		for(int i = auxArray.length - 1; i > -1; i--) {
			
			ScoreData d = auxArray[i];
			
			Fonts.drawText(g, Integer.toString(d.getScore()), scorePos, true, Color.WHITE, Assets.fontMed);
			Fonts.drawText(g, d.getDate(), datePos, true, Color.WHITE, Assets.fontMed);
			
			scorePos.setY(scorePos.getY() + 40);
			datePos.setY(datePos.getY() + 40);
			
		}
		
	}
	
}
