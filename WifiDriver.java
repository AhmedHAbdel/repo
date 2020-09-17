import java.util.Scanner;
public class WifiDriver {



	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.

		// TODO Auto-generated method stub
		System.out.println("Wifi Diagnostic: ");
		System.out.println("Reboot the computer and try to connect");
		sleep(2000);
		System.out.println("That fixed the problem (true/false)");
		 boolean bn = sc.nextBoolean();
		 if (bn == true) {
			 System.out.println("That seems to work");	 
		 }
		 else if(bn == false) {
			  System.out.println("Try to reboot the router");
			  sleep(2000);
			  System.out.println("Rebooting the router, worked(true/false)");
			  boolean bn1 = sc.nextBoolean();
			  if (bn1 == true) {
				  System.out.print("That seemed to work. Good luck");
			  }
			  else if(bn1 ==false) {
				  System.out.println("Make sure the cables, connecting the router are firmly plugged in and power is getting to the router");
				  sleep(2000);
				  System.out.println("That fixed the problem(true/false)");
				  boolean bn2 = sc.nextBoolean();
				  if(bn2 == true) {
					  System.out.print("That seemed to fix the problem");
				  }
				  else if (bn2 == false) {
					  System.out.println("Move the computer closer to the router and try to connect");
					  sleep(2000);
					  System.out.println("Moving the computer closer to the router and attempting to connect, worked(true/false)");
					  boolean bn3 = sc.nextBoolean();
					  if(bn3 == true) {
						  System.out.print("That seemed to work. Great!!");
					  }
					  else if(bn3 == false) {
						  System.out.println("You'll have to contact your ISP");
						  System.out.println("Make sure your ISP is hooked up to your router");
					  }
				  }
				  
				  
				  
			  }
		 }
	}

public static void sleep(int time) {
	try {
		Thread.sleep(time);
	} catch (Exception e) {}

}
}
