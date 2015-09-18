# Poc-s
Apigee Rmi server and client is used to demonstrate the client and server relationship in RMI. 

Import both the projects in eclipse

Steps to setup Server ::

1> Compile the classes (by default they are auto compiled in eclipse) 
2> Navigate to ${project-path}/target/classes open cmd and then run this command "rmic DirectoryOperations" 
3> Open another cmd and type "start rmiregistry"
4> Then open DirectoryStructure.java in eclipse and run DirectoryStructure by specifying the above configuration in RUN configuration --> VM Arguments 
-Djava.security.policy=file:${workspace_loc}/Apigee-RMI-Server/security.policy -Djava.rmi.server.codebase=file:${workspace_loc}/Apigee-RMI-Server/target/classes/

Steps to setup client :: 

1>Open DirectoryClient class in eclipse
2>Then run DirectoryClient by specifying the above configuration in RUN configuration --> VM Arguments 
-Djava.security.policy=file:${workspace_loc}/Apigee-RMI-Client/security.policy -Djava.rmi.server.codebase=file:${workspace_loc}/Apigee-RMI-Server/target/classes/
