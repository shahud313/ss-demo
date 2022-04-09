package Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part5 extends Applet{
Button b1,b2;
TextField t;
 public void init() {
	 add (b1 = new Button("click"));
	 add(t=new TextField(35));
	 add(b2=new Button("clear"));

// b1.addActionListener((ActionEvent e) -> {t.setText("hello");});
 //b2.addActionListener((e) -> t.setText(""));
b1.addActionListener((e) ->{t.setText("this programme has done on7th april");});
b2.addActionListener((e) -> t.setText(""));

	
}}