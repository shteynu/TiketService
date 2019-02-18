package application.model;

import java.time.LocalDate;

interface I_Person {

	void checkingPassword(String userName, String password);
	/*
	 * Using regular expressions, we check the validity of mail and password (both
	 * lines must be in English, the mail must contain a symbol "@" and a dot in the
	 * expression.)
	 */

	void forgenPassword();
	/*
	 * If you forgot your password. Identification via SMS on the phone. It is
	 * necessary to connect the SMS gateway site
	 */

	void showEvents();
	/*
	 * Method show all events
	 */

	void searchEvents(String nameEvents);
	/*
	 * Event search method on request
	 */

	void showDates(LocalDate date);
	/*
	 * Show events by date.
	 */
	
	void selectionEvent(int idEvent);
	/*
	 * Show events by id
	 */
	
	void logOut();
	/*
	 * Sign out
	 */

	
}
