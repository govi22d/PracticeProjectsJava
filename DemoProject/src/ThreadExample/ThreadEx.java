package ThreadExample;

public class ThreadEx extends Thread{

	public static void main(String[] args) {
		ThreadEx t = new ThreadEx();
		t.start();
		
		ThreadEx t1 = new ThreadEx();
		t1.start();
	}

	public void run()
	{
		for(int i = 0; i<10;i++)
		{
			System.out.print(i);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
