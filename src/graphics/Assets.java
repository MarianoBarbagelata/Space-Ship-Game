package graphics;

import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.sound.sampled.Clip;

public class Assets {
	
	public static boolean loaded = false;
	public static float count = 0;
	public static float MAX_COUNT = 58;
	
	public static BufferedImage wallpaper;
	
	public static BufferedImage player;
	public static BufferedImage doubleGunPlayer;
	
	public static BufferedImage speed;
	
	public static BufferedImage[] shieldEffect = new BufferedImage[3];
	
	public static BufferedImage[] exp = new BufferedImage[9];
	
	public static BufferedImage blueLaser, greenLaser, redLaser;

	public static BufferedImage[] bigs = new BufferedImage[4];
	public static BufferedImage[] meds = new BufferedImage[2];
	public static BufferedImage[] smalls = new BufferedImage[2];
	public static BufferedImage[] tinies = new BufferedImage[2];
	
	public static BufferedImage ufo;
	
	public static BufferedImage[] numbers = new BufferedImage[11];
	
	public static BufferedImage life;
	
	public static Font fontBig;
	public static Font fontMed;
	
	public static Clip backgroundMusic, explosion, playerLoose, playerShoot, ufoShoot, powerUp;
	
	public static BufferedImage blueButton;
	public static BufferedImage greyButton;
	
	public static BufferedImage orb, doubleScore, doubleGun, fastFire, shield, star;
	
	public static void init() {
		
		wallpaper = loadImage("/background/wallpaper.png");
		
		player = loadImage("/ships/player.png");
		doubleGunPlayer = loadImage("/ships/doubleGunPlayer.png");
		
		speed = loadImage("/effects/fire.png");
		
		blueLaser = loadImage("/lasers/laserBlue01.png");
		
		greenLaser = loadImage("/lasers/laserGreen11.png");
		
		redLaser = loadImage("/lasers/laserRed01.png");
		
		ufo = loadImage("/ships/ufo.png");
		
		life = loadImage("/others/life.png");
		
		fontBig = loadFont("/fonts/futureFont.ttf", 42);
		
		fontMed = loadFont("/fonts/futureFont.ttf", 20);
		
		for (int i = 0; i < 3; i++) {
			shieldEffect[i] = loadImage("/effects/shield" + (i + 1) +".png"); 
		}
		for (int i = 0; i < bigs.length; i++) {
			bigs[i] = loadImage("/meteors/big"+(i+1)+".png");
		}
		for (int i = 0; i < meds.length; i++) {
			meds[i] = loadImage("/meteors/med"+(i+1)+".png");
		}
		for (int i = 0; i < smalls.length; i++) {
			smalls[i] = loadImage("/meteors/small"+(i+1)+".png");
		}
		for (int i = 0; i < tinies.length; i++) {
			tinies[i] = loadImage("/meteors/tiny"+(i+1)+".png");
		}
		for (int i = 0; i < exp.length; i++) {
			exp[i] = loadImage("/explosion/"+i+".png");
		}
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = loadImage("/numbers/"+i+".png");
		}
		backgroundMusic = loadSound("/sounds/backgroundMusic.wav");
		explosion = loadSound("/sounds/explosion.wav");
		playerLoose = loadSound("/sounds/playerLoose.wav");
		playerShoot = loadSound("/sounds/playerShoot.wav");
		ufoShoot = loadSound("/sounds/ufoShoot.wav");
		powerUp = loadSound("/sounds/powerUp.wav");
		
		greyButton = loadImage("/ui/grey_button.png");
		blueButton = loadImage("/ui/blue_button.png");
		
		orb = loadImage("/powers/orb.png");
		doubleScore = loadImage("/powers/doubleScore.png");
		doubleGun = loadImage("/powers/doubleGun.png");
		fastFire = loadImage("/powers/fastFire.png");
		star = loadImage("/powers/star.png");
		shield = loadImage("/powers/shield.png");
		
		loaded = true;
		
	}

	public static BufferedImage loadImage(String path) {
		count ++;
		return Loader.ImageLoader(path);
	}
	public static Font loadFont(String path, int size) {
		count ++;
		return Loader.loadFont(path, size);
	}
	public static Clip loadSound(String path) {
		count ++;
		return Loader.loadSound(path);
	}
	
}
