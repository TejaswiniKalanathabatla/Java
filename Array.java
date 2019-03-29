package javaTrainingExercise;

import java.util.Random;

public class Array {
	public static void  main(String[] args) {
		int[][] numbers = new int [2][10];
		Random random= new Random();
		for(int i=0;i<1;i++) 
		{
			for(int j=0;j<10;j++) {
				
			numbers[i][j]=random.nextInt(50);
		 
				System.out.print(numbers[i][j]+"\t");
			
			}
		}
		
		System.out.println();		
		for(int i=1;i<2;i++) 
		{
			for(int j=0;j<10;j++) {
				
			numbers[i][j]=random.nextInt(50)*-1;
		      if(numbers[i][j]<0)
				System.out.print(numbers[i][j]+"\t");
			
			}
		}	
				
					
				
	
		}
		
}


			
		
		
		
		
		
		


	
