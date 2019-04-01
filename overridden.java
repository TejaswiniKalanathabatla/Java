
public class overridden {
	int i,j;
	overridden(int a,int b){
		i=a;
		j=b;
	}


void show() {
	System.out.println("i and j:"+ i + " " + j);
}
}
     class B extends overridden {
	   int k;
	   B(int a,int b,int c){
		   super(a,b);
		   k=c;
	   }
		   
	   void show() {
			System.out.println("k: " + k);
		}
	   }
	   
   class Override{
	   public static void main(String ardgs[]) {
		   B obj=new B(2,3,4);
		   obj.show();
	   }
   }
   