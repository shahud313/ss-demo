package Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2part6 extends Applet{
 Button b1,b2;
 TextField t;
		 public void init() {
			 add (b1 = new Button("click"));
			 add(t=new TextField(15));
			 add(b2=new Button("clear"));
			 b1.addActionListener(new H());
			 b2.addActionListener(new I());
			 
			 	 }
}
 class H implements ActionListener {
	
	public void actionperformed (ActionEvent e) {
		Applet2part6.t.setText("Hello world");
		
	}
}
class I implements ActionListener{
	Applet2part5.t.setText("");
}
}