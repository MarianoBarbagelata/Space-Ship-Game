package gameObjects;

import javax.swing.filechooser.FileSystemView;

public class Constants {
	
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	
	public static final int FIRERATE = 400;
	public static final double DELTAANGLE = 0.1;
	public static final double ACC = 0.2;
	public static final double PLAYER_MAX_VEL = 7.0;
	public static final long FLICKER_TIME = 200;
	public static final long SPAWNING_TIME = 3000;
	public static final long GAME_OVER_TIME = 3000;
	
	public static final double LASER_VEL = 15.0;
	
	public static final double METEOR_INIT_VEL = 2.0;
	
	public static final int METEOR_SCORE = 20;
	
	public static final double METEOR_MAX_VEL = 6.0;
	
	public static final int SHIELD_DISTANCE = 150;
	
	public static final int NODE_RADIUS = 160;
	
	public static final double UFO_MASS = 60;
	
	public static final int UFO_MAX_VEL = 3;
	
	public static long UFO_FIRE_RATE = 1000;
	
	public static double UFO_ANGLE_RANGE = Math.PI / 2;
	
	public static final int UFO_SCORE = 40;
	
	public static final long UFO_SPAWN_RATE = 10000;
	
	public static final String PLAY = "PLAY";
	
	public static final String EXIT = "EXIT";
	
	public static final int LOADING_BAR_WIDTH = 500;
	public static final int LOADING_BAR_HEIGHT = 50;
	
	public static final String RETURN = "RETURN";
	public static final String SCORES = "SCORES";
	
	public static final String SCORE = "SCORE";
	public static final String DATE = "DATE";
	
	public static final String SCORE_PATH = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() +
			"\\Space_Ship_Game\\data.json"; 
	
	public static final String PLAYER = "PLAYER";
	public static final String PLAYERS = "PLAYERS";
	
	public static final long POWER_UP_DURATION = 10000;
	public static final long POWER_UP_SPAWN_TIME = 8000;
	
	public static final long SHIELD_TIME = 12000;
	public static final long DOUBLE_SCORE_TIME = 10000;
	public static final long FAST_FIRE_TIME = 14000;
	public static final long DOUBLE_GUN_TIME = 12000;
	
	public static final int SCORE_STACK = 1000;
	
}
