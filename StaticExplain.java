package abstractionexample;

public class StaticExplain {
	
	static int i = 20;
	 void display()
	{
		StaticDemo sd = new StaticDemo();
		System.out.println("In static method");
		sd.displayNotStatic();
	}

}

