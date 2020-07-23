package String.java;

import java.net.InetAddress;

public class HostName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InetAddress ip=InetAddress.getByName("195.201.10.8");
			
			System.out.println("Hostname:"+ip.getHostName());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
