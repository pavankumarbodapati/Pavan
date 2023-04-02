class Fundamentals1{
    
    int a= 30;
    long b= 3000l;
    char c=96;
    double d=10.30;
    public static int e =90;
    static float f=9.99f;

    public static void main(String[] args)
		{

    Fundamentals1 F1=new Fundamentals1();
    
    System.out.println("Main Method Calling Start");
    System.out.println(F1.a);
    System.out.println(F1.b);
    System.out.println(F1.c);
    System.out.println(e);
    System.out.println(f);
    System.out.println("Main Method Calling End");
	System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    F1.m1();
    
    
    
    
    }

    public void m1(){

    int i=65;
    System.out.println("Method Calling Start");
    System.out.println(i);
    System.out.println("Method Calling End");

    
    
    }

}