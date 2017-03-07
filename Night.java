package abstractionexample;

public class Night extends Afternoon {

	int count =1;
	public Night()
	{
		System.out.println("Default constructor");
	}
	public Night(int count) {
		this();
		this.count = count;
	}

	public void dinner() {
		 
		System.out.println("Time for dinner and sleep");
	}
	

}
