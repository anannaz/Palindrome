public class Lab{

	public static void main(String[] args){
		for (int i=1; i<100; i++) {
			

			boolean b=true;
			
			for (int j=2; j<i; j++){
				//System.out.print("j= " + j);
				//System.out.print(" " + i);

				if (i%j==0) {
					b=false;
					break;
					    
				}
			}	
		if(b) System.out.print(" " + i);		
		}
	}
}

