package com.company;


//MultiThreading : is the process of executing two or more programs/Thread in simultaneously.
//Thread         : A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.
//               : for maximum utilization of CPU.


//TWO METHOD: 1: Extends the thread class
//            2: Implement the Runnable Interface


// Extends the thread class:--------->>>  
                                        //create a class
                                        //extends the java.lang.Thread class.
                                        //overrides the run() method available in the Thread class.
                                        //create an object of our new class
                                        //call start() method to start the execution of a thread.
public class m_TDemo {
	
	class MultiThreading1 extends Thread{
		//@override
		public void run() {
			System.out.println("THREAD1 IS RUNNING SUCESSFULY");
		}
	}
   class MultiThreading2 extends Thread{	
		//@override
		public void run() {
			System.out.println("THREAD2 IS RUNNING SUCESSFULY");
		}
   }
	public static void main(String[] args) {
		MultiThreading1 t1 = new MultiThreading1();
		MultiThreading2 t2 = new MultiThreading2();
		t1.start();
		t2.start();
		
	}

}
