import java.util.*;

class Array {
	public static void main(String[] args){
		int[] x;
		double [] [] y;
		int i, j row, col;

		if(args.length != 2){
			System.out.println("Usage: java array row col");
			System.exit(0);
		}

		//initialize the arrays 
		row = Integer.parseInt(args[0]);
		col = Integer.parseInt(args[1]);
		x = new int[row];
		y = new double[row][col];
		for (i = 0; i<row; i++){
			x[i] = i;
		}

		for (i = 0; i < row; i++){
			for (j = 0; j < col; j++){
				y[i][j] = Math.random();
			}
		}
		//display the arrays 
		System.out.println("x[] = ");
		for (i=0; i<row; i++){
			System.out.println("")
		}
	}
}