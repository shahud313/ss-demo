package Applet;

import java.applet.Applet;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.Event;

public class Applet7 extends Applet {
	GridLayout g;
	Checkbox c1,c2,c3,c4;
	TextField t;
	Label l1,l2,l3,l4;
	
	public void init() {
	g = new GridLayout();
    setLayout(g);
		
		
		add(c1 = new Checkbox());
		add(l1 = new Label("1"));
		add(c2 = new Checkbox());
		add(l2 = new Label("2"));
		add(c3 = new Checkbox());
		add(l3 = new Label("3"));
		add(c4 = new Checkbox());
		add(l4 = new Label("4"));
		add(t = new TextField(10));
	}
	
	public boolean action(Event e, Object o) {
		int sum = 0;
		
		if(c1.getState())
			sum = sum+1;
		if(c2.getState())
			sum = sum+2;
		if(c3.getState())
			sum = sum+3;
		if(c4.getState())
			sum = sum+4;
		
		t.setText(String.valueOf(sum));
		return true;
		
	}

	


}