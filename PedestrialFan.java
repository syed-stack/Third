package exercise;

public class PedestrialFan {

	public static void main(String[] args) {
		GoodFan obj=new GoodFan();
		Slow st=new Slow();
		Medium md=new Medium();
		High hg=new High();
		Stops sp=new Stops();
		obj.st=sp;
		obj.pull();
	}

}
class GoodFan{
	Starter st;
	public void pull() {
		System.out.println(st);
	}
	
}



class Starter{
	
}
class Slow extends Starter{
	
}
class Medium extends Starter{
	
}
class High extends Starter{
	
}
class Stops extends Starter{
	
}
		


	

