package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		                
		randNumber.addActionListener((ActionEvent e)->{
			Random rand = new Random();
			int a = rand.nextInt(10);
			System.out.println(a);
		});
		tellAJoke.addActionListener((ActionEvent e)->{
			System.out.println("What happened to the frogs car?"+"\n"+"It got toad LOL");
		});
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}


		
	//	randNumber.addActionListener(this);
	//	tellAJoke.addActionListener(this);
		
	}
	
	

