import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;



public class Main 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Jasoyi");
		frame.setVisible(true);
		frame.setSize(640, 640);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println("hello,world");
		
		// System objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		// Game Variables
		String[] enemies = { "Skeleton", "Zombie", "Warrior", "Assassin"  };
		int maxEnemyHealth = 75;
		int enemyAttackDamage = 25;
		
		// player variables
		
	}

}
