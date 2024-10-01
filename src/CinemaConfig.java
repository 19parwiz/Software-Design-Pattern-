public class CinemaConfig {
    private static CinemaConfig instance;
    private String cinemaName;
    private String operatingHours; // New field for operating hours

    private CinemaConfig() {}

    public static CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getOperatingHours() { // Getter for operating hours
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) { // Setter for operating hours
        this.operatingHours = operatingHours;
    }
}
