package userFactory;

import java.util.Date;

public class Tournament implements Organization{
    private String tournamentName;
    private int Rating;
    private Date Time;
    private String ID;

    public Tournament(String tournamentName, int rating, Date time, String ID) {
        this.tournamentName = tournamentName;
        Rating = rating;
        Time = time;
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date time) {
        Time = time;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "tournamentName='" + tournamentName + '\'' +
                ", Rating=" + Rating +
                ", Time=" + Time +
                '}';
    }

    @Override
    public boolean cheak() {
        return false;
    }

    @Override
    public void cluster() {

    }
}
