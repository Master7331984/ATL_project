package Hotel;

public enum Roomtype {
    STANDARD{
        @Override
        public void displayInfo() {
            System.out.println("Bu standart otaqdir ve tek otaqlidir");

        }
    },
    SUITE{
        @Override
        public void displayInfo() {
            System.out.println("Suite otaqda metbex var");

        }
    },
    DELUXE{
        @Override
        public void displayInfo() {
            System.out.println("Deluxe otaqda balkon var");

        }
    };
    public abstract void displayInfo();


}
