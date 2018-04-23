![Gundi](https://paihari.github.io/repo/gundi-logo.png)

# Decorator Example

This artifact comprises a demo of an Test Decorator framework to test the EJBs, Data access components which is mostly found the enterprise application. This will be enhanced to testing messaging and webservice
The demo showcases how to combine the Local testing and Server Container testing.
This is achived by absolute zero boiler plate code

The decorator test framework will decorate the object under purview with annotated resources
The framework will look through the  classes, to find EJBs, EntityManagers there by fully dressing them up for testing.


# Instructions for setting up

1. `git clone https://github.com/paihari/decorator-example.git`
2. `cd decorator-example`
3. Edit javax.persistence.jdbc.url property in /decorator-example/ejb/src/main/resources/META-INF/persistence.xml to point to a convinient folder to store derby data files 
4. `./gradlew clean build`   
5. Find the result of test in /decorator-example/ejb/build/reports/tests/test/index.html

What did just happen, As the part of the build we ran two two Tests. 

MySimpleDecoratorTest is a test class for testing MySimpleEJB. This single EJB, with no dependency to DB or other EJB

MyComplexDecoratorTest is a test class for testing MyComplexEJB. This EJB has dependencies to ParentEJB, MasterEJB.
ParentEJB and MasterEJB has dependencies to ChildEJB and WorkerEJB respectively. Each of these EJB will insert a TODO item in the database.




# Online Container Testing

You must have noticed, that the project structure indicates this is a typical web application which can be deployed in a Container.
The web.war is packaged as a part of gradle build, this war file can be deployed in a server.
In my case I used Apache TomEE server

1. Download the apache-tomee-plume-7.X.X from http://tomee.apache.org/download-ng.html
2. Edit the apache-tomee-plume-7.0.4/conf/tomcat-users.xml in to setup the user to deploy the web application
3. Run /apache-tomee-plume-7.0.4/bin/startup.sh/bat
4. Access the http://localhost:8080/manager/html 
5. Deploy the web.war using the "War file to deploy" Option
6. Test the deployment by invoking http://localhost:8080/web/

You can now test the EJBs using the same Testclasses which was used for offline unit test

1. Edit the file for correctness /decorator-example/ejb/src/test/resources/resources.properties
2. Change the Annotation @TestRuntimeConfig testOnContainer attribute to true
3. Run the Tests.

The test will inject the remote EJBs from the online container and invoke necessary services

# TODO

1. Add the JMS Services"
2. Add Webservices Services.
