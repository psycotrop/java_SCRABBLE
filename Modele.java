package scrabble;

import java.awt.Color;
import java.util.Observable;
import java.util.Random;


public class Modele extends Observable{
	
	static Color g =Color.green;
	static Color b =Color.blue;
	static Color r =Color.red;
	static Color p=Color.pink;
	static Color w=Color.white;
	public static char[] ALPHABET= {'A','A','A','A','A','A','A','A','A','B','B','C','C','D','D','D','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E',
									'F','F','G','G','H','H','I','I','I','I','I','I','I','I','J','K','L','L','L','L','L','M','M','M','N','N','N','N','N','N','O','O','O','O','O','O',
									'P','P','Q','R','R','R','R','R','R','S','S','S','S','S','S','T','T','T','T','T','T','U','U','U','U','U','U','V','V','W','X','Y','Z'};
	
	
	public static final Object[][] plateaucouleur ={
			{r,g,g,p,g,g,g,r,g,g,g,p,g,g,r},
			{g,w,g,g,g,b,g,g,g,b,g,g,g,w,g},
			{g,g,w,g,g,g,p,g,p,g,g,g,w,g,g},
			{g,p,g,w,g,g,g,p,g,g,g,w,g,p,g},
			{g,g,g,g,w,g,g,g,g,g,w,g,g,g,g},
			{g,b,g,g,g,b,g,g,g,b,g,g,g,b,g},
			{g,g,p,g,g,g,p,g,p,g,g,g,p,g,g},
			{r,g,g,p,g,g,g,w,g,g,g,p,g,g,r},
			{g,g,p,g,g,g,p,g,p,g,g,g,p,g,g},
			{g,b,g,g,g,b,g,g,g,b,g,g,g,b,g},
			{g,g,g,g,w,g,g,g,g,g,w,g,g,g,g},
			{g,p,g,w,g,g,g,p,g,g,g,w,g,p,g},
			{g,g,w,g,g,g,p,g,p,g,g,g,w,g,g},
			{g,w,g,g,g,b,g,g,g,b,g,g,g,w,g},
			{r,g,g,p,g,g,g,r,g,g,g,p,g,g,r}
		
	};
	public  Object[][] grille;
	
	
	public char[] premierpool;
	
	
	
	public Modele(){
		this.grille= plateaucouleur;
		this.premierpool= Modele.pooldelettre();	
		
	}
	
	
	public static char[] pooldelettre() {
		char[] pool = new char[6];
		Random gen =new Random();
		int i;
		for (i=0;i<7;i++) {
			pool[i]=ALPHABET[gen.nextInt(ALPHABET.length)];
		}
		return pool;
			
	}
	
	public static char[] remplirpool(char[] pool) {
		Random gen = new Random();
		int i;
		for (i=pool.length;i<7;i++) {
			pool[i]=ALPHABET[gen.nextInt(ALPHABET.length)];	
		}
		return pool;
		
		
		
	}
	
	
	

}
