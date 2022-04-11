package Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Applet6 extends Applet {
	Button b1,b2;
	TextField t;
	public void init() {
	add (b1= new Button("click"));
	add (t =new TextField(15));
	add (b2= new Button("clear"));
	b1.addFocusListener(new FocusListener() {
		
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			t.setText("helo world");
		}
	});
	b2.addFocusListener(new FocusListener() {
		
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
    t.setText("");			
		}
	});
	}	
	
	

}
