
public class Overloading {
public static void main (String args[]) {
Box box1= new Box(10,20,15);
Box box2= new Box(30,20,30);


double Volume;

Volume=box1.volume();
System.out.println("Volume of box1 is " + Volume);

Volume=box2.volume();
System.out.println("Volume of box2 is " + Volume);


}
}
