package com.tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class tankFrame extends Frame {
	//让方块动起来
			int  x=200,y=200;
	public tankFrame() {
		
		setSize(1100,700);
		setResizable(false);
		setVisible(true);
		setTitle("tankFrame");
		//键盘监听处理类
		this.addKeyListener(new MyKeyListenner());
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
                 System.exit(0);
		}
		});
	}
	
	@Override//paint 方法自动调用      
	public void paint(Graphics g) {
		System.out.println("print");
		g.fillRect(x, y, 50, 50);//填充一个矩形  前两项是坐标后两项是宽高
		x+=10;
		y+=10;
		
	}
	class MyKeyListenner extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {//一个键被按下去时调用
			System.out.println("key press");
		}

		@Override
		public void keyReleased(KeyEvent e) {//一个键被弹起来时调用
			System.out.println("key releas");
		}
		
	}
	
	
	
}
