public class fundamentals {
   //Variable Syntax:-
  //<A.M> <D.T> <variable_name>=<Value/Expression/Objects>;
  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  int x=10; //default int x=10; // non static variable

  public int y=30; //public int y=30; //non static variable

  static short s=90; //dafault static short s=90; // static variable

  static  long l=99l;  // static variable
  float fl=90.9f;
  double d=90.9;
  char c ='c';
  boolean b =true;

  public static void main(String[] args){//main started //static area
      int z=40;

      System.out.println(l);
     // System.out.println(x); //non-static variable x cannot be referenced from a static context
     // we are unable to access non-static variables in static area directly

     //object creation syntax
	 //<ClassName> <object ref> = new <ClassName>(); 
	 fundamentals f=new fundamentals(); // we can call non static variable by object ref

      System.out.println(f.x);
	  System.out.println(f.y);
      System.out.println(f.l);
	  System.out.println(s);
      System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
      System.out.println("non static menthod calling");
	  f.m1();



  }//main close

  public void m1(){ //non static area
	  System.out.println(s);//we can call static variable in non static area
	  System.out.println(d);
  }

}