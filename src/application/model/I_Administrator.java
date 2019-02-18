package application.model;

import java.time.LocalDate;

interface I_Administrator extends I_Person {

	void addEvents (int idEvent, String nameEvent, String nameArtist, int numberHall, 
			LocalDate dateEvent, LocalDate timeEvent, String typeOfEvent, String decription);
	/*
	 * Method adds new events
	 */
	
	 void editEvent(int idEvent);
	 /*
	  * Editing an existing event
	  */

}


