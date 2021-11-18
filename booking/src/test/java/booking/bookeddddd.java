package booking;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bookeddddd {
	@Given("Open booking.com website using an incognito tab")
	public void open_booking_com_website_using_an_incognito_tab() {
	    System.out.println("open_booking_com_website_using_an_incognito_tab");
	}

	@Then("First search the hotels in Mumbai")
	public void first_search_the_hotels_in_mumbai() {
		System.out.println("First search the hotels in Mumbai");
	}

	@And("Select the date  1st September {int} ? 2nd September {int} \\({int} night)")
	public void select_the_date_1st_september_2nd_september_night(Integer int1, Integer int2, Integer int3) {
		System.out.println("select_the_date_1st_september_2nd_september_night");
	}

	@And("Select {int} room for {int} adults")
	public void select_room_for_adults(Integer int1, Integer int2) {
		System.out.println(" select_room_for_adults");
	}

	@Then("search hotels according to given data")
	public void search_hotels_according_to_given_data() {
		System.out.println("search hotels according to given data");
	}

	@And("Apply ?Price \\(lowest first)\"  for first page hotel cards")
	public void apply_price_lowest_first_for_first_page_hotel_cards() {
		System.out.println("Apply first low price");
	}

	@And("Validate data record")
	public void validate_data_record() {
		System.out.println("Validate data record");
	}

	@Given("First search the hotels in Budapest")
	public void first_search_the_hotels_in_budapest() {
		System.out.println("First search the hotels in Budapest");
	}

	@Then("Select the date 30th December {int} ? 2nd January {int} \\({int} nights)")
	public void select_the_date_30th_december_2nd_january_nights(Integer int1, Integer int2, Integer int3) {
		System.out.println("select_the_date_30th_december_2nd_january_nights");
	}

	@And("Select {int} rooms for {int} adults")
	public void select_rooms_for_adults(Integer int1, Integer int2) {
		System.out.println("select rooms for adults");
	  
	}

	@And("Validate data")
	public void validate_data() {
		System.out.println("Validate data");
	 
	}

	@Given("First search the hotels in London")
	public void first_search_the_hotels_in_london() {
		System.out.println("First search the hotols in london");
	}

	@Then("Select the date {int} days, {double} {int} months from today \\(execution time), {double} day \\({int} night)")
	public void select_the_date_days_months_from_today_execution_time_day_night(Integer int1, Double double1, Integer int2, Double double2, Integer int3) {
		System.out.println("select_the_date_days_months_from_today_execution_time_day_night");
	}

	@And("Select {int} room for {int} adults {int} children \\({int} years old, {int} years old)")
	public void select_room_for_adults_children_years_old_years_old(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5) {
		System.out.println("select_room_for_adults_children_years_old_years_old");
	}

	@Given("Check all data of hotels Mumbai")
	public void check_all_data_of_hotels_mumbai() {
		System.out.println("Check all data of hotels Mumbai");
	}

	@When("I check for the <nights> in hotel")
	public void i_check_for_the_nights_in_hotel() {
		System.out.println("I check for the <nights> in hotel");
	}

	@Then("I verify the success")
	public void i_verify_the_success() {
		System.out.println("I verify the success");
	}

	@Given("Check all data of hotels Budapest")
	public void check_all_data_of_hotels_budapest() {
		System.out.println("Check all data of hotels Budapest");
	}

	@Given("Check all data of hotels London")
	public void check_all_data_of_hotels_london() {
		System.out.println("Check all data of hotels London");
	}


}
