This is the Python half of the Java/Python interoperability demo.  It uses the OmniOrb open source python (and C++) orb.

Dr Gary Allen.
University of Huddersfield

To use this part of the demo:

1. In a terminal (inside your IDE or stand-alone) 'cd' to the folder containing this demo.  For example I would type:


    cd IntelliJProjects/Jacorb_InteroperabilityDemo/Python_OmniOrb/

2. Compile the IDL to create the Stub and Skeleton Modules:


	omniidl -bpython HelloWorld.idl


3. Start the Server:


	python server.py


4. Start client in another terminal:


	python client.py


At this point the Python Client is calling the Python Server.  That's not "Interoperability", so now look at the Jacorb (java) demo.  Follow the instructions in the README to get that demo working too, then swap the "server.ref" files around to get the Java client calling the Python server, and vice-versa.  That is "Interopability".


Remember to kill the server when you have finished with it by pressing ctrl-c.

