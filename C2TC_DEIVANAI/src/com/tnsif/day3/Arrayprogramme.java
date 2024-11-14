package com.tnsif.day3;

public class Arrayprogramme {

	public static void main(String[] args) {
		 ChildThread threadOne = new ChildThread(5, "First");
			ChildThread threadTwo = new ChildThread(10, "Second");

			threadOne.start();
			//threadOne.start(); // throws IllegalStateException
			// threadOne.run(); // single threaded application 
			threadTwo.start();

			System.out.println("-----------------------End of Main--------------------------");
		}
	}

		
		
	}

}
