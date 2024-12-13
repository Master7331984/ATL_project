package Hotel;

public abstract class Room {
    private int roomNumber;
    private double price;
    private boolean isBooked;
    private Roomtype room;

    public Room(int roomNumber, double price, Roomtype room) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = true;
        this.room=room;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public void displayInfo() {

    }


    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", price=" + price +
                ", isBooked=" + isBooked +
                '}';
    }
    public void  Reserve(){
        if(isBooked){
            System.out.println("Otaq artiq reserv edilib" +roomNumber);
            isBooked=true;
        } else{
            System.out.println("Otaq doludur");
        }

    }

    public void CancelReserve(){
        if(!isBooked){
            isBooked=true;
            System.out.println("Sizin reserv legv olundu");
        }
        else {
            System.out.println("Reserv olunmayib otaq boshdur");
        }
    }
}
