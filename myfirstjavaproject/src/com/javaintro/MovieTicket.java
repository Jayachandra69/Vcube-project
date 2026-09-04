package com.javaintro;

public class MovieTicket {
	
	    String movieName;
	    int seatNumber;
	    boolean booked;
	    static String theatreName = "PVR Cinemas";
	    
	    MovieTicket(String movieName, int seatNumber) {
	        this.movieName = movieName;
	        this.seatNumber = seatNumber;
	        this.booked = false; 
	    }
	    
	    void bookTicket() {
	        booked = true;
	        System.out.println("Ticket booked for " + movieName + " Seat: " + seatNumber);
	    }
	    
	    void cancelTicket() {
	        booked = false;
	        System.out.println("Ticket cancelled for " + movieName + " Seat: " + seatNumber);
	    }
	    
	    void displayTicketDetails() {
	        System.out.println("Movie Name: " + movieName);
	        System.out.println("Seat Number: " + seatNumber);
	        System.out.println("Booking Status: " + (booked ? "Booked" : "Not Booked"));
	        System.out.println("Theatre Name: " + theatreName);
	        System.out.println("---------------------------");
	    }
	    
	    static void changeTheatreName(String newName) {
	        theatreName = newName;
	        System.out.println("Theatre name changed to: " + theatreName);
	    }
	    
	    static void displayTheatreName() {
	        System.out.println("Theatre Name: " + theatreName);
	    }


	public static void main(String[] args) {
		
		MovieTicket t1 = new MovieTicket("Pushpa 2", 1);
        MovieTicket t2 = new MovieTicket("Spiderman", 2);
        
        System.out.println("Initial Ticket Details:");
        t1.displayTicketDetails();
        t2.displayTicketDetails();
        
        t1.bookTicket();
        t2.cancelTicket();

        MovieTicket.changeTheatreName("AAA Cinemas");

        System.out.println("\nUpdated Ticket Details:");
        t1.displayTicketDetails();
        t2.displayTicketDetails();

	}

}
