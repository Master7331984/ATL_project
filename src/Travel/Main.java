package Travel;

import java.util.Arrays;
import java.util.List;

        public class Main {
        public static void main(String[] args) {
            TravelAgency agency = new TravelAgency("Travel MMC");

            Tour tour1 = new Tour(1, "Cimerlik sahili", 200.0, TourPackag.BEACH_HOLIDAY);
            Tour tour2 = new Tour(2, "Sheher turu gezintisi", 150.0, TourPackag.CITY_TOUR);
            Tour tour3 = new Tour(3, "Dag gezintisi", 300.0, TourPackag.MOUNTAIN_ADVENTURE);
            Tour tour4 = new Tour(4, "Gemi ile seyahet", 500, TourPackag.CRUISE_TRIP);
            Tour tour5 = new Tour(5, "Sehra gezintisi",200.0,TourPackag.DESERT_SAFARI);

            agency.addTour(tour1);
            agency.addTour(tour2);
            agency.addTour(tour3);

            agency.displayTour();
            agency.addCustomer(new Customer(2, Arrays.asList(tour1, tour2), "Yusif"));
            Customer customer = new Customer(1, List.of(tour3, tour2), "Semed");
            agency.addCustomer(customer);
            customer.displayDetails();
            agency.displayCustomer();
            tour1.reserveTour();
            tour1.cancelReservation();
            tour2.reserveTour();
        }
    }
