public class Xpattern {

	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==j){
					System.out.print("*");
				}
				else if((i+j)==6){
					System.out.print("*");
				}
				else if(i==1&&j==2||i==1&&j==3||i==1&&j==4)
				{
					System.out.print("_");
				}
				else if(i==3&&j==1||i==3&&j==2)
				{
					System.out.print("_");
					
				}
	
				else if(i==2&&j==1||i==2&&j==3)
				{
					System.out.print("_");
				}
				else if(i>j)
				{
					System.out.print("_");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.print("\n");
		}
		
	
	}

	}


