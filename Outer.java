package javaTrainingExercise;

public class Outer {
   int outer_x=100;
   
    public void test() {
    	Inner inn= new Inner();
    	inn.display();
    }
   public class Inner{
	   void display() {
		   System.out.println("display:outer_x = " + outer_x);
		   
	   }
   }
}
 class Innerclass{
	   public static void main(String args[] ){
		   Outer outer= new Outer();
		   outer.test();
	   }
   }
 