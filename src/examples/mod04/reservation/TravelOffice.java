package examples.mod04.reservation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelOffice {
	private static TravelOffice instance;
	private TravelOffice() {
		//
	}
	public static TravelOffice getInstance() {
		if (instance == null) {
			instance = new TravelOffice();
		}
		return instance;
	}
	
	//int customerCount = 0;
	//Customer customers [] = new Customer[2];
	
	List<Customer> customers = new ArrayList<Customer>();
	
	Map<Customer, Trip> trips = new HashMap<Customer, Trip>();
	
	
	public void assignTrip(Customer cust, Trip trip) {
		
		trips.put(cust, trip);	
	}
	
	public void showTripInfo() {
	
		for(Map.Entry<Customer, Trip> entry : trips.entrySet()) {
			
			Trip trip = entry.getValue();
			
			System.out.println("***key: " + entry.getKey().geInfo() + " val: " + trip.getInfo() + "\n");
		}
	}
	
	public void addCustomer(Customer customer) {
	
		customers.add(customer);
	}
	
	/*public void addCustomer(Customer customer) {
		if (customerCount == customers.length) {
			Customer temp[] = new Customer[customers.length*2];
			System.arraycopy(customers, 0, temp, 0, customers.length);
			customers = temp;
		}
		customers[customerCount++] = customer;
	}*/
	
	public int getCustomerCount() {
		
		return customers.size();
	}
	
	public String getInfo() {
		
		String report = "";		
		for (Customer cust : customers) {
			
			report = report + cust.geInfo()+"\n";
		}
		return report;		
	}
	
	/*public String getInfo() {
		String report = "";
		for (int i = 0; i<customerCount; i++) {
			report += customers[i].geInfo()+"\n";
		}
		
		return report;
	}*/
	
	
	public void saveCustomerToFile(String fileName) throws IOException {
		
		File file = new File(fileName);
		
		FileWriter fw = new FileWriter(file);
		
		fw.write("Customers: " + System.getProperty("line.separator"));
		
		for (Customer cust : customers) {
			
			fw.write(cust.geInfo() + System.getProperty("line.separator"));			
		}		
		fw.close();
	}
		
	public void saveToFile(String fileName) throws IOException {
		
		File file = new File(fileName);
		
		FileWriter fw = new FileWriter(file);
		
		fw.write("Trips: " + System.getProperty("line.separator"));
		
		for (Trip trip : trips.values()) {
			
			fw.write(trip.getInfo() + System.getProperty("line.separator"));			
		}		
		fw.close();
	}
	
	public String readFromFile(String fileName) throws IOException {
		
		File file = new File(fileName);
		
		FileReader fr = new FileReader(file);
		
		char [] buffer = new char[(int) file.length()];
		
		fr.read(buffer);
		fr.close();
		
		String result = new String(buffer);
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
