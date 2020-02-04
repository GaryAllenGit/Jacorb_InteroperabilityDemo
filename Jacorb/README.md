This is the Java half of the Java/Python interoperability demo.  It uses the Jacorb Orb.

Dr Gary Allen.
University of Huddersfield

If you don't already have it, download Jacorb from the Jacorb web site and unpack it somewhere.

Also download the library jboss-rmi-api_1.0_spec-1.0.6.Final.jar from the Maven Repository at:

    https://mvnrepository.com/artifact/org.jboss.spec.javax.rmi/jboss-rmi-api_1.0_spec/1.0.6.Final.

This is a workaround to fix an issue with Java 11 and above.

NOTE that, for reasons I have not been able to work out, if a Java client calls a method on a Python server that takes no parameters, then the client and server both crash.  For this reason a hack has been introduced here to make the "hello_world" method accept a string parameter.  The parameter is unused, and is there simply to avoid this problem.


To use this part of the demo:

1.  Add all the libraries from the Jacorb lib folder to the project (they are not all required, but I don't know the minmum set) **AND** add the jboss library too.

2.  Precompile the idl.  To do this use the terminal built into Intellij (or an external terminal if you prefer) and type:


    cd Jacorb/src
    <path_to_jacorb_dir>/bin/idl HelloWorld.idl

e.g. I would type:

    cd Jacorb/src
    /local/jacorb-3.9/bin/idl HelloWorld.idl
    
3.  To stop Jacorb displaying extensive logging information add the following VM args to the HelloServer and HelloClient run configurations:


    -Djacorb.log.default.verbosity=2
    
That will ensure errors and warnings are displayed, but not general info.  (You might try running the code without these arguments to see the extra logging information produced.  Setting the level to 4 gives even more detail.)

4. Start server from the IDE.

5. Start the client from the IDE.

At this point the Java Client is calling the Java Server.  That's not "Interoperability", so now look at the Python/OmniOrb demo.  Follow the instructions in the README to get that demo working too, then swap the "server.ref" files around to get the Java client calling the Python server, and vice-versa.  That is "Interopability".



