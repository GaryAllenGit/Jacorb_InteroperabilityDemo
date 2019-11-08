import HelloWorld.*;

import org.omg.CORBA.*;
import java.io.*;


public class HelloClient {

	public static void main(String[] args) {
		try {
			// create and initialize the ORB
			ORB orb = ORB.init(args, null);

			// read in the 'stringified IOR'
			BufferedReader in = new BufferedReader(new FileReader("server.ref"));
			String stringified_ior = in.readLine();
			System.out.println("stringified_ior = " + stringified_ior);

			// get object reference from stringified IOR
			org.omg.CORBA.Object server_ref =
					orb.string_to_object(stringified_ior);
			Hello server =
					HelloWorld.HelloHelper.narrow(server_ref);

			// call the Hello server object and print results
			String salutation = server.hello_world();
			System.out.println(salutation);

		} catch (Exception e) {
			System.out.println("ERROR : " + e) ;
			e.printStackTrace(System.out);
		}
	}

}
