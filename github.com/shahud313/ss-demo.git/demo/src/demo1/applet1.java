package demo1;


import java.applet.Applet;
import java.awt.*;

public class applet1 extends Applet{
	Button b;
	TextField t;
	public void init() {
		b= new Button("submit");
		add(b);
		t= new TextField();
		add(t);
	}
	

}