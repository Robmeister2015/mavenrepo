package rob.robart;

public class GetSet {

	int thisInt = 0;
	
	public void setThisInt(int setMe){
		thisInt = setMe;
	}
	
	public int getThisInt(){
		return thisInt;
	}
	
	public void randomMethodToMakeClassLonger(){
		System.out.println("This is over ten lines now!");
	}
	
	public static void main(String[] args){
		new GetSet().randomMethodToMakeClassLonger();
	}
}
