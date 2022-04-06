package demo1;

class Stud
{  
int rollno;  
String name;  
float fee;  
Stud(int r,String n,float f){  
rollno=r;  
name=n;  
fee=f;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis3{  
public static void main(String args[]){  
Stud s1=new Stud(111,"ankit",5000f);  
Stud s2=new Stud(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  