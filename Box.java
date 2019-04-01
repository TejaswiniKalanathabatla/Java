
public class Box {
	double height;
	double breadth;
	double depth;
	



     Box(Box boxobject){
	height=boxobject.height;
	breadth=boxobject.breadth;
	depth=boxobject.depth;
	
}
     
	public Box(int height, int breadth, int depth) {
		
	}

	double  volume(){
    	 return height*breadth*depth;
     }
    	 
     }
