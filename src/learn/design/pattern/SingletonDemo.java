package learn.design.pattern;

public class SingletonDemo {
	public static void main(String [] args)
	{
		XXSingleton instance = XXSingleton.getInstance();
		System.out.println(instance);
	}
}
// Returns single instance everytime 
// Thats why Singleton Pattern