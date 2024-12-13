package Hotel;

public class SuiteRoom extends Room {
    private boolean isKitchen;

    public SuiteRoom(int roomNumber, double price, Roomtype roomtype) {
        super(roomNumber, price, roomtype);
    }


    @Override
    public void displayInfo() {
//        System.out.println("Otaq nomresi " + getRoomNumber()
//                + " Otaq qiymeti " + getPrice() +
//                " Metbex secimi " +
//                ((isKitchen)?"Metbex var":"Metbex yoxdur"));

    }
}
