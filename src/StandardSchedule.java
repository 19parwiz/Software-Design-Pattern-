public class StandardSchedule implements MovieSchedule {
    private Movie movie;
    private String time;

    public void setTime(String time) {
        this.time = time;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public MovieSchedule clone() {
        StandardSchedule clone = new StandardSchedule();
        clone.setMovie(movie); // Clone the movie if needed
        clone.setTime(time);
        return clone;
    }
}
