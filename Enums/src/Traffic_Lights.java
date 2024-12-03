public enum Traffic_Lights {
    RED("stop"),
    YELLOW("ready"),
    GREEN("go");

    private String action;

    public String getAction() {

        return action;
    }

    Traffic_Lights(String message) {
        this.action= message;
    }
}
