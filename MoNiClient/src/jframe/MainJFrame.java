package jframe;

import javax.swing.JFrame;

import Constant.ConStatic;

public class MainJFrame extends JFrame{

	public static void main(String[] args) {
		MainJFrame m = new MainJFrame();
		m.setBounds(ConStatic.STARTX,ConStatic.STARTY, ConStatic.WIDTH,ConStatic.HEIGHT );
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameJPanel jp =new GameJPanel();
		m.add(jp);
		m.setResizable(false);
		m.setVisible(true);
		
		Thread testA=new Thread(jp);  
		testA.start();
	}
}
