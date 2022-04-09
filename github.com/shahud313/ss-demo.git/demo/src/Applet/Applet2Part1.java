package Applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part1 extends Applet implements ActionListener {
 Button b1,b2;
 TextField t;
 public void init() {
	 add (b1 = new Button("click"));
	 add(t=new TextField(35));
	 add(b2=new Button("clear"));
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 
 }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Object o =e.getSource();
	if (o.equals(b1))
		t.setText("This programme was done on 6 th april");
	if (o.equals(b2))
		t.setText("");
		
}
 
}
