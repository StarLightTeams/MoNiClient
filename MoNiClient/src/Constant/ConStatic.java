package Constant;

import java.awt.Toolkit;

public class ConStatic {
	//��Ļ���
	public static final int WIDTH = 640;
	//��Ļ�߶�
	public static final int HEIGHT = 1136;	
	//��Ļ��ʼ����λ��
	public static final int STARTX = 300;
	public static final int STARTY = 0;
	
	
	//myBoard�Ŀ��
	public static final int MYBOARDWIDTH = 100;
	//myBoard�ĸ߶�
	public static final int MYBOARDHEIGHT = 20;
	//myBoard�ĳ�ʼXλ��
	public static final int MYBOARDX = 20;	
	//myBoard�ĳ�ʼyλ��
	public static final int MYBOARDY = HEIGHT/2+100;

	//ball��ֱ��
	public static final int D = 30;
	//ball�ĳ�ʼXλ��
	public static final int BALLX = WIDTH/2/2/2;
	//ball�ĳ�ʼYλ��
	public static final int BALLY= HEIGHT/2;
	//ball�ĳ�ʼ�ٶ�
	public static final  int BALLSPEED= 5;
	
	//ball��״̬
	public static final int STATE_CENTER = 0;
	public static final int STATE_BEHIND = 1;
	public static final int STATE_DBEHIND=2;
	public static final int STATE_INSIDE = 3;
	public static final int STATE_OUTSIDE = 4;
	
	//ball���ƶ�����
	public static final int BALL_MOVE_LEFTUP = 0;
	public static final int BALL_MOVE_LEFTDOWN = 1;
	public static final int BALL_MOVE_RIGHTUP = 2;
	public static final int BALL_MOVE_RIGHTDOWN = 3;
	
	
	
}
