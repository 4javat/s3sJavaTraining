
public class Animation {
	
	class Animal{  
		String color= "red";  
		}  
		class Dog extends Animal{  
		String color="black";  
		void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
		}  
		}  
		class TestSuper1{  
		public void main(String args[]){  
		Dog d=new Dog();  
		d.printColor();  
		}}  

}
