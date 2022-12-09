package polymorphism;

public class ExampleUsingThisKeyword {
	
	public ExampleUsingThisKeyword() {
		System.out.println("This is our default constructor");
	}
	
	public ExampleUsingThisKeyword(String s) {
		this();
		System.out.println("One Parameter");
	}
	public ExampleUsingThisKeyword(int x) {
		this("java");
		System.out.println("Integer Parameter" +x);
	}
	public ExampleUsingThisKeyword(int x, int y)
	{
		this(66);
		System.out.println("Two parameter" + x  +y);
	}
	
}
