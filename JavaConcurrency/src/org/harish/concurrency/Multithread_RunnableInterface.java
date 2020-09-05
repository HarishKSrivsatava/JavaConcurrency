package org.harish.concurrency;

public class Multithread_RunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("This is overridden run() method.");
	}

	public static void main(String[] args){
		Multithread_RunnableInterface mr = new Multithread_RunnableInterface();
		Thread _newThread_1 = new Thread(mr);
		_newThread_1.run();
		System.out.println("This is main() method. ");
		Thread _newThread_2 = new Thread(mr, "custom-thread");
		_newThread_2.run();

		System.out.println("===============================================================");
		System.out.println("Current Thread : " +Thread.currentThread());
		System.out.println("Current Thread Id : " +Thread.currentThread().getId());
		System.out.println("Current Thread Name : " +Thread.currentThread().getName());
		System.out.println("Current Thread Priority : " +Thread.currentThread().getPriority());
		System.out.println("Current Thread Group : " +Thread.currentThread().getThreadGroup());
		System.out.println("===============================================================");
		System.out.println(" Thread _newThread_1 : " +_newThread_1);
		System.out.println(" Thread _newThread_1 Id : " +_newThread_1.getId());
		System.out.println(" Thread _newThread_1 Name : " +_newThread_1.getName());
		System.out.println(" Thread _newThread_1 Priority : " +_newThread_1.getPriority());
		System.out.println(" Thread _newThread_1 Thread Group : " +_newThread_1.getThreadGroup());
		System.out.println("===============================================================");
		System.out.println(" Thread _newThread_2 : " +_newThread_2);
		System.out.println(" Thread _newThread_2 Id : " +_newThread_2.getId());
		System.out.println(" Thread _newThread_2 Name : " +_newThread_2.getName());
		System.out.println(" Thread _newThread_2 Priority : " +_newThread_2.getPriority());
		System.out.println(" Thread _newThread_2 Thread Group : " +_newThread_2.getThreadGroup());
	}
	

}
