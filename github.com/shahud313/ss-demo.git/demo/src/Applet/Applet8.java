package Applet;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Applet8 extends Applet{
	public void init() {
		//add(b1=new Button("click"));
		//b1.addActionListener();
		addMouseMotionListener(new MouseMotionAdapter() {
		@Override
		public void mouseMoved (MouseEvent e) {
		int x= e.getX();
		int y=e.getY();
		//String i = String.valueOf(x);
		//String j = String.valueOf(y);
		showStatus(String.valueOf(x)+","+ String.valueOf(y));		
		}
		});
	}

}
