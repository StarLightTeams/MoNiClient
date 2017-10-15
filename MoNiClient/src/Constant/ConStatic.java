package Constant;

import java.awt.Toolkit;

public class ConStatic {
	//屏幕宽度
	public static final int WIDTH = 640;
	//屏幕高度
	public static final int HEIGHT = 1136;	
	//屏幕初始出现位置
	public static final int STARTX = 300;
	public static final int STARTY = 0;
	
	
	//myBoard的宽度
	public static final int MYBOARDWIDTH = 100;
	//myBoard的高度
	public static final int MYBOARDHEIGHT = 20;
	//myBoard的初始X位置
	public static final int MYBOARDX = 20;	
	//myBoard的初始y位置
	public static final int MYBOARDY = HEIGHT/2+100;

	//ball的直径
	public static final int D = 30;
	//ball的初始X位置
	public static final int BALLX = WIDTH/2/2/2;
	//ball的初始Y位置
	public static final int BALLY= HEIGHT/2;
	//ball的初始速度
	public static final  int BALLSPEED= 5;
	
	//ball的状态
	public static final int STATE_CENTER = 0;
	public static final int STATE_BEHIND = 1;
	public static final int STATE_DBEHIND=2;
	public static final int STATE_INSIDE = 3;
	public static final int STATE_OUTSIDE = 4;
	
	//ball的移动方向
	public static final int BALL_MOVE_LEFTUP = 0;
	public static final int BALL_MOVE_LEFTDOWN = 1;
	public static final int BALL_MOVE_RIGHTUP = 2;
	public static final int BALL_MOVE_RIGHTDOWN = 3;
	
	
	
}
