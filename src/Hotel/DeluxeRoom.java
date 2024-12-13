package Hotel;

public class DeluxeRoom extends Room {
    private boolean isBalcon;

    public DeluxeRoom(int roomNumber, double price, Roomtype roomtype) {
        super(roomNumber, price, roomtype);
    }


    @Override
    public void displayInfo() {
//        System.out.println("Otaq nomresi " + getRoomNumber()
//                + " Otaq qiymeti " + getPrice() +
//                " Balkon secimi " +
//                ((isBalcon)?"Balkon var":"Balkon yoxdur"));

    }
}
