public class BoomerSooner{
	public static void main(String[] args){
		boolean notNumber;
		for (int i = 1; i < 1000; i ++){
			if((i % 3 == 0) && (i % 5 == 0)){
				System.out.println("BoomerSooner");
			}
			else if(i % 5 == 0){
				System.out.println("Sooner");
			} 
			else if(i % 3 == 0){
				System.out.println("Boomer");
			}
			else{
				System.out.println(i);
			}
			
		}
	}
}