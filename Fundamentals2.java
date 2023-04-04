public class Fundamentals2{

             // non-static 

	int x = 30;   // declaration+initialization

	int y;        // declaration
	 //y =80;      //value assignment

	float f;

	char c;

	boolean b;

	String    str;
	
	Fundamentals2   f2;  


	   // static

	static int a = 10;

	static int as;

	static float fs;

	static char cs;

	static boolean bs;
	
	static 	String    strg;
	
	static  Fundamentals2   f3;


	public static void main(String[] args){
	
	Fundamentals2 ft=new Fundamentals2();


        System.out.println("======================non-static variables calling==================");
        System.out.println(ft.x);
	System.out.println(ft.y);
	System.out.println(ft.f);
	System.out.println(ft.c);
	System.out.println(ft.b);
	System.out.println(ft.str);
	System.out.println(ft.f2);
	
	System.out.println("==============================static variables calling================");
	System.out.println(a);
	System.out.println(as);
	System.out.println(fs);
	System.out.println(cs);
	System.out.println(bs);
	System.out.println(strg);
	System.out.println(f3);


	
	
	}


}


/*======================non-static variables calling==================
30
0
0.0

false
null
null
==============================static variables calling================
10
0
0.0

false
null
null*/