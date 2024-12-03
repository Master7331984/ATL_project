public enum Seasons {
    SPRING(1,25,"Orta ayliq tempratur 20 derece "),
    SUMMER(26,45,"Orta ayliq tempratur 30 derece "),
    AUTUMN(10,20,"Orta ayliq tempratur 15 derece "),
    WINTER(-5,10,"Orta ayliq tempratur 2 derece ");

    private final int minTemp;
    private final int maxTemp;

    public String getDescription() {
        return description;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    private final String description;

    Seasons(int minTemp, int maxTemp, String description) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.description = description;
    }
    public String getMessage(){


        return "minimum temperatur:"+ minTemp +" maximum temperatur"+maxTemp+ "Orta temperatur" + description;


    }

}
