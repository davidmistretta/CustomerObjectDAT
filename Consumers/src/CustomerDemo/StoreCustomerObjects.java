package CustomerDemo;

import java.io.*; //for object output stream and object input stream

import Users.*;

public class StoreCustomerObjects 
{
	
	public static void main(String[] args)
	{
	     // Create instances of FileOutputStream and ObjectOutputStream.
        try (FileOutputStream fos = new FileOutputStream("customers.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Create a PreferredCustomer instance. This book object then will be stored in
            // the file.
            PreferredCustomer pc = new PreferredCustomer("David Mistretta","943 Fakedale Way, Funnyvale, MO, 01337","978-000-0000","01A001");
            pc.setBalance(550);
            System.out.println("Object to input into customers.dat\n" + pc.toString() +"\n\n");
            // By using writeObject() method of the ObjectOutputStream we can
            // make the customer object persistent on the customers.dat file.
            oos.writeObject(pc);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // We have the customer saved. Now it is time to read it back and display
        // its toString information.
        try (FileInputStream fis = new FileInputStream("customers.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            // To read the pc object use the ObjectInputStream.readObject() method.
            // This method returns Object type data so we need to cast it back the its
            // origin class, the PreferredCustomer class.
            PreferredCustomer pca = (PreferredCustomer) ois.readObject();
            System.out.println("Object output from customers.dat\n" + pca.toString());
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } 
	 	
	}
}
