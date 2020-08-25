package ThreadExample;

public class WorkerThread implements Runnable{

	@Override
	public void run() {
		processMessage();
	}
	
	public void processMessage()
	{
		System.out.println("processing");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
