package Interface;

public	interface Drawable{  
		void draw();  
		default void msg(){System.out.println("default method");}  
		}  
		class square implements Drawable{  
		public void draw(){System.out.println("drawing square");}  
		}  
		class TestInterfaceDefault{  
		public static void main(String args[]){  
		Drawable d=new square();  
		d.draw();  
		d.msg();  
		}}  

