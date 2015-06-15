
public class SingletonClass {

	public SingletonClass(){}
	
	public static void main(String args[]){
		
		System.out.println("----------Singleton class");
		SingletonClass singleton = new SingletonClass();
		
	}
}

class TestClass{
	
	public static void main(String args[]){
		System.out.println("----------Test class");
		SingletonClass singleton = new SingletonClass();
	}
	
}