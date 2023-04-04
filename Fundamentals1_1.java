class  Fundamentals1_1
{
	int a=10;
	long b= 15l;
	char c= 60;
	public static int d=70;
	static float e=10.6f;


	public static void main(String[] args) 
	{
		Fundamentals1_1 f=new Fundamentals1_1();

		System.out.println("fundamentals local variables printing start");
		System.out.println(f.a);
		System.out.println(f.b);
		System.out.println(f.c);
		System.out.println(d);
		System.out.println(e);
		f.m1();

	}
	public void m1(){
		int i=25;
		System.out.println("method calling start");
		System.out.println(i);

	}
}