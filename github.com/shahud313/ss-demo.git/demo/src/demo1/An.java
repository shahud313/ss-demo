package demo1;

public class An {  
	void eat(){System.out.println("eating...");}  
	}  
	class D extends An{  
	void bark(){System.out.println("barking...");}  
	}  
	class Am extends D{  
	void weep(){System.out.println("weeping...");}  
	}  
	class TestInheritance2{  
	public static void main(String args[]){  
	Am a=new Am();  
	a.weep();  
	a.bark();  
	a.eat();  
	}}  


