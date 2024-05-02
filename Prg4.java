// Create client server Application using RMI. 

// Following is an example of a remote interface. Here we have defined an interface with the name Hello and it has a method called printMsg().
import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface Hello extends Remote {  
   void printMsg() throws RemoteException;  
} 
// Here, we have created a class named ImplExample and implemented the interface Hello
// Implementing the remote interface 
public class ImplExample implements Hello {  
   
   // Implementing the interface method 
   public void printMsg() {  
      System.out.println("This is an example RMI program");  
   }  
} 
// Following is an example of an RMI server program.
import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 

public class Server extends ImplExample { 
   public Server() {} 
   public static void main(String args[]) { 
      try { 
         // Instantiating the implementation class 
         ImplExample obj = new ImplExample(); 
    
         // Exporting the object of implementation class  
         // (here we are exporting the remote object to the stub) 
         Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);  
         
         // Binding the remote object (stub) in the registry 
         Registry registry = LocateRegistry.getRegistry(); 
         
         registry.bind("Hello", stub);  
         System.err.println("Server ready"); 
      } catch (Exception e) { 
         System.err.println("Server exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
} 

// Following is an example of an RMI client program.
import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  

public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         Hello stub = (Hello) registry.lookup("Hello"); 
    
         // Calling the remote method using the obtained object 
         stub.printMsg(); 
         
         // System.out.println("Remote method invoked"); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}

