package Travel;

public class Tour {
    private int tourId;
    private String tourName;
    private double price;
    private boolean isReserved;
    private TourPackag tourPackage;

    public Tour(int tourId, String tourName, double price, TourPackag tourPackage) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.price = price;
        this.tourPackage = tourPackage;
        this.isReserved = false;


    }

    public int getTourId() {
        return tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public Tour(int tourId, String tourName, double price, boolean isReserved, TourPackag tourPackage) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.price = price;
        this.isReserved = isReserved;
        this.tourPackage = tourPackage;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public TourPackag getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackag tourPackage) {
        this.tourPackage = tourPackage;
    }

    public void reserveTour() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Tur " + tourName + " rezerv edilib.");
        } else {
            System.out.println("Tur " + tourName + " artiq doludur.");
        }
    }

    public void cancelReservation() {
        if (isReserved) {
            isReserved = false;
            System.out.println("Tur rezervasiyasi " + tourName + " legv edildi.");
        } else {
            System.out.println("Tur " + tourName + " rezerv edilmeyib.");
        }
    }

    public void displayDetails() {
        System.out.println("Tur ID: " + tourId +
                ", Turun adi: " + tourName +
                ", Qiymeti" + price +
                ", Tur Paketi: " + tourPackage +
                ", Rezerv edilib: " + (isReserved ? "Yes" : "No"));
    }


}
