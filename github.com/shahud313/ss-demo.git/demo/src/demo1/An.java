package demo1;

public class An {  
	void eat(){System.out.println("eating...");}  
	}  
	class D extends An{  
	void bark(){System.out.println("barking...");}  
	}  
	class BabyDog extends D{  
	void weep(){System.out.println("weeping...");}  
	}  
	class TestInheritance2{  
	public static void main(String args[]){  
	BabyDog d=new BabyDog();  
	d.weep();  
	d.bark();  
	d.eat();  
	}}  


