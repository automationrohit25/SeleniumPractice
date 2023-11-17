package interviewJavaPrograms;

public class Test5 {
	
	static int i;
	int j;
	
	static {
		i = 10;
		System.out.println("static block called");
	}
	
	{
		System.out.println("init block called");
	}

	Test5(){
		System.out.println("constructor called");
	}
	public static void main(String[] args) {
		
		Test5 t1 = new Test5();
		Test5 t2 = new Test5();

	}

}
