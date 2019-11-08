This is a Corba Interoperability Demo using Java with the Jacorb Orb and Python with the OmniOrb Orb.

Dr Gary Allen.
University of Huddersfield.

There are two versions of a Corba based client-server "Hello World" demo here.
In the "Jacorb" folder there is a Java demo that uses the Jacorb Orb.
In the "Python_OmniOrb" folder there is a Python demo that uses the OmniOrb Orb.
Both folders contain a README.md file with instructions for how to run that demo.
The demos can be run independently, but they both use the "IOR in a file trick", writing the IOR of the server into a file called "server.ref".
Start both servers, then swap the server.ref files around, then run the clients, and the Java client will connect to the Python server and the Python client will connect to the Java server.

