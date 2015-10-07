package examples.mod04.reservation;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		// utworz biuro podrozy
		TravelOffice to = TravelOffice.getInstance();

		// budujemy trzy wycieczki
		Trip trip = new Trip(new Date(2004, 8, 1), new Date(2004, 8, 14), "Greece");
		trip.setPrice(1000);
		
		DomesticTrip dtrip = new DomesticTrip(new Date(2004, 8, 1), new Date(2004, 8, 14), "Jurata");
		dtrip.setPrice(800);
		dtrip.setOwnArrivalDiscount(100);
		
		AbroadTrip atrip = new AbroadTrip(new Date(2004, 8, 1), new Date(2004, 8, 14), "Egipt");
		atrip.setPrice(1200);
		atrip.setInssurance(200);
		
		// budujemy pierwszego klienta
		Customer customer = new Customer("Jan Kowalski");
		customer.setAddress("Marszalkowska 10, Warszawa");
		customer.assignTrip(trip);
		to.addCustomer(customer);  //dodajemy go do biura

		customer = new Customer("Jozef Nowak");
		customer.setAddress("Al. Jerozolimskie 120, Warszawa");
		customer.assignTrip(dtrip);
		to.addCustomer(customer);  //dodajemy go do biura

		to.assignTrip(customer, dtrip);		
		
		customer = new Customer("Jaroslaw Lis");
		customer.setAddress("Swietokrzyska 14, Warszawa");
		customer.assignTrip(atrip);
		to.addCustomer(customer);  //dodajemy go do biura

		to.assignTrip(customer, atrip);
				
		String fileName = "C:/lab/projects/travel/travel.txt";
		
		//Zapis do pliku
		to.saveCustomerToFile(fileName);
		
		//Odczyt z pliku
		String customersFromFile = to.readFromFile(fileName);
		
		//Wizualizacja
		System.out.println(customersFromFile);
	}
}
