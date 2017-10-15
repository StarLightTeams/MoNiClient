package jframe;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GameJPanel extends JPanel implements MouseMotionListener, Runnable {
	JTextArea jt;
	JTextArea jt2;
	JTextArea jt3;
	Socket s;
	public GameJPanel() {
		this.setLayout(null);
		jt = new JTextArea(100, 430);
		jt.setSize(100, 200);
		jt.setBounds(50, 100, 260, 500);
		this.add(jt);
		
		JLabel jl1 =new JLabel("账号");
		jl1.setBounds(340, 100, 80, 80);
		this.add(jl1);
		
		jt2 = new JTextArea(100, 43);
		 jt2.setSize(50,20);
		jt2.setBounds(400, 100, 150, 100);
		this.add(jt2);
		
		JLabel jl2 =new JLabel("密码");
		jl2.setBounds(340, 300, 80, 80);
		this.add(jl2);
		
		jt3 = new JTextArea(100, 83);
		 jt3.setSize(50,20);
		jt3.setBounds(400, 300, 150, 100);
		this.add(jt3);
		
		JButton b1 = new JButton("登录");
		b1.setSize(100, 100);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onclick();
			}
		});
		b1.setBounds(400, 500, 100, 100);
		this.add(b1);
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

	}

	public void onclick() {
		try {
			String zh =jt2.getText();
			String mm =jt3.getText();
			OutputStream output =s.getOutputStream();
			//
			String ss= "zh:"+zh+",mm:"+mm;
			System.out.println(ss);
			//转为byte数组
			byte[] b =ss.getBytes();
			//写入outputstream
			output.write(b);
			//刷新流，发送
			output.flush();
			
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//sockets.remove(socket);
		}
	}

	public void run() {
		// TODO Auto-generated method stub
		boolean a = false;
		do {
			a = connectServer();
			if (a) {
				System.out.println("连接成功");
			} else {
				jt.append("连接失败" + "\r\n");
			}
			repaint();
		} while (!a);
//		while (true) {
//			
//		}
	}

	public boolean connectServer() {
		try {
			 s = new Socket("127.0.0.1", 10020);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}
}
