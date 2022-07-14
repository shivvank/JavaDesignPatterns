package learn.design.pattern;

public class XXSingleton {
	private static XXSingleton instance = new XXSingleton();
	private XXSingleton() {}
	public static XXSingleton getInstance()
	{
		return instance;
	}
}
