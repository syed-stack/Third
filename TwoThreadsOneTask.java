package classwork;

public class TwoThreadsOneTask {

	public static void main(String[] args) {
		Canon bofors=new Canon();
		ShootingTask st=new ShootingTask(bofors);
		
		Thread sheikh=new Thread(st,"sheikh");
		Thread chilli=new Thread(st,"chilli");
		
        sheikh.start();
		chilli.start();
	}
}
class ShootingTask implements Runnable{
	Canon gun;
	public ShootingTask(Canon gun) {
		this.gun=gun;
	}
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		if(t.getName().equals("sheikh")) {
			for(int i=0;i<8;i++) {
				gun.fill();
			}
		}
		else if(t.getName().equals("chilli")) {
			for(int i=0;i<8;i++) {
				gun.shoot();
			}
		}
	}
}
class Canon{
	public void fill() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" fills the gun.......");
	}
	
	public void shoot() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" shoot the gun...........");
	}


	}


