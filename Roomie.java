import java.util.Random;
public class Roomie {
	public static void main(String[] args){
		Random rand = new Random(); //initialize random
		int lengtho = rand.nextInt(4) + 5; //make random length
		int widtho = rand.nextInt(4) + 5; //make random width
		String[][] room = new String [lengtho][widtho];//make array with dimensions
		//int inside = 1;//use this to count array size if needed
		for (int len = 0; len < lengtho; len++){
			for (int wid = 0; wid < widtho; wid++){
				room[len][wid] = "X";//fill it with x's 
				//room[len][wid] = "["+ inside++ +"]"; //use this to count array size if needed
			}
		}
		if (lengtho < 7){
			if (widtho < 7){
				int blockadeType = rand.nextInt(2)+1;//randomly pick a structure
				switch (blockadeType){
					case 1:
						for (int i =1; i<=3; i++){
							room[1][i] = "_";
							room[2][3] = "_";
							room[3][i] = "_";
						}
						break;
					case 2:
						for (int i =1; i<=3; i++){
							room[1][i] = "_";
							room[2][1] = "_";
							room[3][i] = "_";
						}	
						break;
				}	
			}		
		}
		for (int len = 0; len < lengtho; len++){
			for (int wid = 0; wid < widtho; wid++){
		        System.out.print(room[len][wid] + " ");//print this puppy
		    }
		    System.out.println();
		}
		
	}
}
