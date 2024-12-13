package Hotel;

public class StandartRoom extends Room {
    private boolean isSingleBed;

    public StandartRoom(int roomNumber, double price, Roomtype roomtype) {
        super(roomNumber, price, roomtype);
    }


    @Override
    public void displayInfo() {
//        System.out.println("Otaq nomresi " + getRoomNumber()
//                + " Otaq qiymeti " + getPrice() +
//                " Yataq sayi " +
//                ((isSingleBed)?"Tek yataqlidir":"Cut yataqlidir"));

    }
}
